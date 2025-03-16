document.addEventListener("DOMContentLoaded", renderTasks);

function getTasks() {
  return JSON.parse(localStorage.getItem("tasks")) || [];
}

function saveTasks(tasks) {
  localStorage.setItem("tasks", JSON.stringify(tasks));
}

function addTask() {
  let taskInput = document.getElementById("taskInput");
  let category = document.getElementById("category").value;
  let taskText = taskInput.value.trim();

  if (!taskText) return;

  let tasks = getTasks();
  tasks.push({ text: taskText, category, completed: false });
  saveTasks(tasks);

  taskInput.value = "";
  renderTasks();
}

function renderTasks() {
  let taskList = document.getElementById("taskList");
  let filter = document.getElementById("filterCategory").value;
  taskList.innerHTML = "";

  let tasks = getTasks();

  tasks
    .filter((task) => filter === "All" || task.category === filter)
    .forEach((task, index) => {
      let li = document.createElement("li");
      li.draggable = true;
      li.dataset.index = index;
      li.className = task.completed ? "completed" : "";

      li.innerHTML = `
                <span onclick="toggleComplete(${index})">${task.text} (${task.category})</span>
                <button onclick="editTask(${index})">Edit</button>
                <button onclick="deleteTask(${index})">Delete</button>
            `;

      li.addEventListener("dragstart", dragStart);
      li.addEventListener("dragover", dragOver);
      li.addEventListener("drop", drop);

      taskList.appendChild(li);
    });
}

function deleteTask(index) {
  let tasks = getTasks();
  tasks.splice(index, 1);
  saveTasks(tasks);
  renderTasks();
}

function editTask(index) {
  let tasks = getTasks();
  let newText = prompt("Edit task:", tasks[index].text);
  if (newText !== null) {
    tasks[index].text = newText.trim();
    saveTasks(tasks);
    renderTasks();
  }
}

function toggleComplete(index) {
  let tasks = getTasks();
  tasks[index].completed = !tasks[index].completed;
  saveTasks(tasks);
  renderTasks();
}

// Drag and Drop Features
let draggedIndex = null;

function dragStart(event) {
  draggedIndex = event.target.dataset.index;
}

function dragOver(event) {
  event.preventDefault();
}

function drop(event) {
  event.preventDefault();
  let tasks = getTasks();
  let droppedIndex = Array.from(event.target.parentNode.children).indexOf(
    event.target
  );

  if (draggedIndex !== null && draggedIndex !== droppedIndex) {
    let draggedTask = tasks.splice(draggedIndex, 1)[0];
    tasks.splice(droppedIndex, 0, draggedTask);
    saveTasks(tasks);
    renderTasks();
  }
}
