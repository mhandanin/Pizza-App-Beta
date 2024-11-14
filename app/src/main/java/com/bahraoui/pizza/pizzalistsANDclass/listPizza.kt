package com.bahraoui.pizza.pizzalistsANDclass

import com.bahraoui.pizza.R

var listPizza = listOf(
    Pizza(
        id = 1,
        image = R.drawable.p1,
        name = "Pizza Mexican",
        description = "Pizza mexican originale, épicée et mélange de plusieurs magnifiques ingrédients",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup pepperoni",
            "1/4 cup sausage",
            "1/4 cup green bell peppers, chopped",
            "1/4 cup red onion, chopped",
            "1/4 cup olives"
        ),
        temp = 35.0f,
        prix = 75.55f
    ),

    Pizza(
        id = 2,
        image = R.drawable.p2,
        name = "Pizza Margherita",
        description = "Pizza margherita classique avec sauce tomate fraîche et mozzarella fondue",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, sliced",
            "Fresh basil leaves",
            "1 tbsp olive oil",
            "Salt to taste"
        ),
        temp = 30.0f,
        prix = 60.0f
    ),

    Pizza(
        id = 3,
        image = R.drawable.p3,
        name = "Pizza Pepperoni",
        description = "Pizza pepperoni avec généreuse portion de pepperoni et fromage fondant",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/2 cup pepperoni slices"
        ),
        temp = 40.0f,
        prix = 80.0f
    ),

    Pizza(
        id = 4,
        image = R.drawable.p4,
        name = "Pizza Quatre Fromages",
        description = "Pizza quatre fromages avec un mélange crémeux et fondant de fromages",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "2 oz mozzarella cheese, shredded",
            "2 oz blue cheese, crumbled",
            "2 oz parmesan cheese, grated",
            "2 oz goat cheese, crumbled"
        ),
        temp = 50.0f,
        prix = 90.0f
    ),

    Pizza(
        id = 5,
        image = R.drawable.p5,
        name = "Pizza Hawaïenne",
        description = "Pizza hawaïenne sucrée-salée avec ananas et jambon",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/2 cup pineapple chunks",
            "1/2 cup ham, sliced"
        ),
        temp = 45.0f,
        prix = 85.0f
    ),

    Pizza(
        id = 6,
        image = R.drawable.p6,
        name = "Pizza Végétarienne",
        description = "Pizza végétarienne pleine de légumes frais pour une option plus légère",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup mushrooms, sliced",
            "1/4 cup bell peppers, chopped",
            "1/4 cup olives",
            "1/4 cup spinach"
        ),
        temp = 33.0f,
        prix = 70.0f
    ),

    Pizza(
        id = 7,
        image = R.drawable.p1,
        name = "Pizza BBQ Chicken",
        description = "Pizza au poulet barbecue avec une sauce BBQ riche et du fromage fondant",
        ingredients = listOf(
            "1/2 cup BBQ sauce",
            "8 oz mozzarella cheese, shredded",
            "1 cup cooked chicken breast, diced",
            "1/4 cup red onion, sliced",
            "1/4 cup cilantro, chopped"
        ),
        temp = 55.0f,
        prix = 95.0f
    ),

    Pizza(
        id = 8,
        image = R.drawable.p2,
        name = "Pizza Fromage et Champignons",
        description = "Pizza crémeuse avec des champignons et un mélange de fromages",
        ingredients = listOf(
            "1/2 cup white sauce",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup mushrooms, sliced",
            "1/4 cup parmesan cheese, grated",
            "1/4 tsp black pepper"
        ),
        temp = 47.0f,
        prix = 85.0f
    ),

    Pizza(
        id = 9,
        image = R.drawable.p3,
        name = "Pizza Spicy Pepperoni",
        description = "Pizza épicée avec pepperoni et sauce piquante",
        ingredients = listOf(
            "1/2 cup spicy tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/2 cup spicy pepperoni",
            "1/4 tsp red chili flakes"
        ),
        temp = 42.0f,
        prix = 82.0f
    ),

    Pizza(
        id = 10,
        image = R.drawable.p4,
        name = "Pizza Marinara",
        description = "Pizza simple sans fromage avec une sauce marinara riche",
        ingredients = listOf(
            "1 cup marinara sauce",
            "Fresh basil leaves",
            "1 tbsp olive oil",
            "1 clove garlic, minced",
            "Salt to taste"
        ),
        temp = 25.0f,
        prix = 50.0f
    ),

    Pizza(
        id = 11,
        image = R.drawable.p5,
        name = "Pizza Supreme",
        description = "Pizza avec un mélange de viande, légumes et fromage",
        ingredients = listOf(
            "1/2 cup tomato sauce",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup pepperoni",
            "1/4 cup sausage",
            "1/4 cup mushrooms, sliced",
            "1/4 cup bell peppers, chopped",
            "1/4 cup onions, chopped",
            "1/4 cup black olives"
        ),
        temp = 60.0f,
        prix = 110.0f
    ),

    Pizza(
        id = 12,
        image = R.drawable.p6,
        name = "Pizza Saumon Fumé",
        description = "Pizza légère et raffinée avec saumon fumé et crème fraîche",
        ingredients = listOf(
            "1/2 cup crème fraîche",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup smoked salmon",
            "1/4 cup red onions, sliced",
            "Fresh dill"
        ),
        temp = 65.0f,
        prix = 100.0f
    ),

    Pizza(
        id = 13,
        image = R.drawable.p1,
        name = "Pizza Pesto",
        description = "Pizza unique avec une sauce pesto fraîche et légumes grillés",
        ingredients = listOf(
            "1/2 cup pesto sauce",
            "8 oz mozzarella cheese, shredded",
            "1/4 cup grilled zucchini, sliced",
            "1/4 cup sun-dried tomatoes, chopped",
            "1/4 cup arugula"
        ),
        temp = 48.0f,
        prix = 78.0f
    ),

    Pizza(
        id = 14,
        image = R.drawable.p2,
        name = "Pizza Poulet Alfredo",
        description = "Pizza crémeuse au poulet Alfredo avec sauce blanche et fromage",
        ingredients = listOf(
            "1/2 cup Alfredo sauce",
            "8 oz mozzarella cheese, shredded",
            "1 cup cooked chicken breast, sliced",
            "1/4 cup mushrooms, sliced",
            "1/4 cup spinach"
        ),
        temp = 55.0f,
        prix = 90.0f
    ),

    Pizza(
        id = 15,
        image = R.drawable.p3,
        name = "Pizza Tex-Mex",
        description = "Pizza inspirée de la cuisine Tex-Mex avec du boeuf épicé et du fromage cheddar",
        ingredients = listOf(
            "1/2 cup salsa",
            "8 oz cheddar cheese, shredded",
            "1/2 cup ground beef, cooked",
            "1/4 cup bell peppers, chopped",
            "1/4 cup black olives",
            "1/4 tsp chili powder"
        ),
        temp = 50.0f,
        prix = 88.0f
    )
)
