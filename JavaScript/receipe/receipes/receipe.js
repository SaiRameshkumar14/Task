const mealContainer = document.getElementById("meal-container");
const searchInput = document.getElementById("search");
const detailsDiv = document.getElementById("details");
const backBtn = document.getElementById("backBtn");

async function fetchMeals(query = "") {
  const res = await fetch(
    `https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`
  );
  const data = await res.json();
  displayMeals(data.meals);
}

function displayMeals(meals) {
  mealContainer.innerHTML = "";
  if (!meals) {
    mealContainer.innerHTML = '<p class="text-center">No meals found</p>';
    return;
  }
  meals.forEach((meal) => {
    const col = document.createElement("div");
    col.classList.add("col-md-4");
    col.innerHTML = `
      <div class="card meal mb-4">
        <img src="${meal.strMealThumb}" class="card-img-top" alt="${meal.strMeal}" />
        <div class="card-body">
          <h5 class="card-title text-primary text-center">${meal.strMeal}</h5>
        </div>
      </div>
    `;
    col
      .querySelector(".meal")
      .addEventListener("click", () => showDetails(meal.idMeal));
    mealContainer.appendChild(col);
  });
}

async function showDetails(id) {
  const res = await fetch(
    `https://www.themealdb.com/api/json/v1/1/lookup.php?i=${id}`
  );
  const data = await res.json();
  const meal = data.meals[0];

  mealContainer.style.display = "none";
  searchInput.style.display = "none";
  backBtn.style.display = "block";
  detailsDiv.style.display = "block";

  let ingredients = "";
  for (let i = 1; i <= 20; i++) {
    if (meal[`strIngredient${i}`]) {
      ingredients += `<li>${meal[`strIngredient${i}`]} - ${
        meal[`strMeasure${i}`]
      }</li>`;
    }
  }

  detailsDiv.innerHTML = `
    <h2 class="text-primary">${meal.strMeal}</h2>
    <img src="${meal.strMealThumb}" class="img-fluid rounded mb-3" />
    <p><strong>Category:</strong> ${meal.strCategory}</p>
    <p><strong>Area:</strong> ${meal.strArea}</p>
    <h5 class="text-secondary mt-3">Ingredients</h5>
    <ul>${ingredients}</ul>
    <h5 class="text-secondary mt-3">Instructions</h5>
    <p>${meal.strInstructions}</p>
    ${
      meal.strYoutube
        ? `<h5 class="text-secondary mt-3">Video</h5>
           <div class="ratio ratio-16x9">
             <iframe src="https://www.youtube.com/embed/${
               meal.strYoutube.split("v=")[1]
             }" allowfullscreen></iframe>
           </div>`
        : ""
    }
  `;
}

function goBack() {
  detailsDiv.style.display = "none";
  backBtn.style.display = "none";
  searchInput.style.display = "inline-block";
  mealContainer.style.display = "flex";
}

searchInput.addEventListener("input", (e) => {
  fetchMeals(e.target.value);
});

fetchMeals();

// const mealContainer = document.getElementById("meal-container");
// const searchInput = document.getElementById("search");
// const detailsDiv = document.getElementById("details");
// const backBtn = document.getElementById("backBtn");
// const favoritesContainer = document.getElementById("favoritesContainer");
// const favoritesList = document.getElementById("favoritesList");

// let favorites = JSON.parse(localStorage.getItem("favorites")) || [];

// async function fetchMeals(query = "") {
//   const res = await fetch(
//     `https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`
//   );
//   const data = await res.json();
//   displayMeals(data.meals);
// }

// function displayMeals(meals) {
//   mealContainer.innerHTML = "";
//   if (!meals) {
//     mealContainer.innerHTML = '<p class="text-center">No meals found</p>';
//     return;
//   }
//   meals.forEach((meal) => {
//     const col = document.createElement("div");
//     col.classList.add("col-md-4");
//     col.innerHTML = `
//     <div class="card meal mb-4">
//       <img src="${meal.strMealThumb}" class="card-img-top" alt="${meal.strMeal}" />
//       <div class="card-body">
//         <h5 class="card-title text-primary text-center">${meal.strMeal}</h5>
//       </div>
//     </div>
//   `;
//     col
//       .querySelector(".meal")
//       .addEventListener("click", () => showDetails(meal.idMeal));
//     mealContainer.appendChild(col);
//   });
// }

// async function showDetails(id) {
//   const res = await fetch(
//     `https://www.themealdb.com/api/json/v1/1/lookup.php?i=${id}`
//   );
//   const data = await res.json();
//   const meal = data.meals[0];
//   mealContainer.style.display = "none";
//   searchInput.style.display = "none";
//   backBtn.style.display = "block";
//   detailsDiv.style.display = "block";

//   let ingredients = "";
//   for (let i = 1; i <= 20; i++) {
//     if (meal[`strIngredient${i}`]) {
//       ingredients += `<li>${meal[`strIngredient${i}`]} - ${
//         meal[`strMeasure${i}`]
//       }</li>`;
//     }
//   }

//   const isFavorite = favorites.includes(meal.idMeal);

//   detailsDiv.innerHTML = `
//   <h2 class="text-primary">${meal.strMeal}</h2>
//   <img src="${meal.strMealThumb}" class="img-fluid rounded mb-3" />
//   <p><strong>Category:</strong> ${meal.strCategory}</p>
//   <p><strong>Area:</strong> ${meal.strArea}</p>
//   <h5 class="text-secondary mt-3">Ingredients</h5>
//   <ul>${ingredients}</ul>
//   <h5 class="text-secondary mt-3">Instructions</h5>
//   <p>${meal.strInstructions}</p>
//   ${
//     meal.strYoutube
//       ? `<h5 class="text-secondary mt-3">Video</h5><div class="ratio ratio-16x9"><iframe src="https://www.youtube.com/embed/${
//           meal.strYoutube.split("v=")[1]
//         }" allowfullscreen></iframe></div>`
//       : ""
//   }
//   <div class="text-center mt-4">
//     <button class="btn btn-outline-primary" onclick="toggleFavorite('${
//       meal.idMeal
//     }', '${meal.strMeal}')">${
//     isFavorite ? "Remove from" : "Add to"
//   } Favorites</button>
//   </div>
// `;
// }

// function toggleFavorite(id, name) {
//   const index = favorites.indexOf(id);
//   if (index > -1) {
//     favorites.splice(index, 1);
//   } else {
//     favorites.push(id);
//   }
//   localStorage.setItem("favorites", JSON.stringify(favorites));
//   showDetails(id);
//   renderFavorites();
// }

// function renderFavorites() {
//   favoritesList.innerHTML = "";
//   if (favorites.length === 0) {
//     favoritesContainer.style.display = "none";
//     return;
//   }
//   favoritesContainer.style.display = "block";
//   favorites.forEach(async (id) => {
//     const res = await fetch(
//       `https://www.themealdb.com/api/json/v1/1/lookup.php?i=${id}`
//     );
//     const data = await res.json();
//     const meal = data.meals[0];
//     const item = document.createElement("button");
//     item.className = "list-group-item list-group-item-action favorite-item";
//     item.textContent = meal.strMeal;
//     item.onclick = () => showDetails(id);
//     favoritesList.appendChild(item);
//   });
// }

// function goBack() {
//   detailsDiv.style.display = "none";
//   backBtn.style.display = "none";
//   searchInput.style.display = "inline-block";
//   mealContainer.style.display = "flex";
// }

// searchInput.addEventListener("input", (e) => {
//   fetchMeals(e.target.value);
// });

// fetchMeals();
// renderFavorites();
