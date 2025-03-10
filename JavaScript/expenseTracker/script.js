let expenses = [];

function addExpense() {
  const desc = document.getElementById("desc").value;
  const amount = parseFloat(document.getElementById("amount").value);
  if (desc && amount) {
    const expense = { id: Date.now(), desc, amount };
    expenses.push(expense);
    renderExpenses();
    document.getElementById("desc").value = "";
    document.getElementById("amount").value = "";
  }
}

function renderExpenses() {
  const list = document.getElementById("expenseList");
  list.innerHTML = "";
  expenses.forEach((expense) => {
    const li = document.createElement("li");
    li.innerHTML = `${expense.desc}: $${expense.amount} 
                <button onclick="editExpense(${expense.id})">Edit</button> 
                <button onclick="deleteExpense(${expense.id})">Delete</button>`;
    list.appendChild(li);
  });
  calculateTotal();
}

function editExpense(id) {
  const expense = expenses.find((e) => e.id === id);
  const newDesc = prompt("Edit Description:", expense.desc);
  const newAmount = parseFloat(prompt("Edit Amount:", expense.amount));
  if (newDesc && !isNaN(newAmount)) {
    expense.desc = newDesc;
    expense.amount = newAmount;
    renderExpenses();
  }
}

function deleteExpense(id) {
  expenses = expenses.filter((e) => e.id !== id);
  renderExpenses();
}

function calculateTotal() {
  const total = expenses.reduce((sum, e) => sum + e.amount, 0);
  document.getElementById("total").textContent = total;
}
