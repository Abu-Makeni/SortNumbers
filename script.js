// script.js

document.getElementById('collectNumbersButton').addEventListener('click', collectNumbers);
document.getElementById('sortNumbersButton').addEventListener('click', sortNumbers);

function collectNumbers() {
    const numCount = document.getElementById('numCount').value;
    const numbersInputsContainer = document.getElementById('numbersInputs');

    // Clear previous inputs
    numbersInputsContainer.innerHTML = '';

    // Create input fields for entering numbers
    for (let i = 0; i < numCount; i++) {
        const inputField = document.createElement('input');
        inputField.type = 'number';
        inputField.placeholder = `Enter number ${i + 1}`;
        inputField.id = `numInput${i + 1}`;
        numbersInputsContainer.appendChild(inputField);
    }
}

function sortNumbers() {
    const numCount = document.getElementById('numCount').value;
    let numbers = [];

    // Collect numbers from the input fields
    for (let i = 0; i < numCount; i++) {
        const numInput = document.getElementById(`numInput${i + 1}`);
        if (numInput) {
            numbers.push(Number(numInput.value));
        }
    }

    // Get sorting choice
    const sortingOrder = document.getElementById('sortingOrder').value;

    // Sort numbers based on the chosen order
    if (sortingOrder === 'A') {
        numbers.sort((a, b) => a - b);  // Ascending order
    } else if (sortingOrder === 'D') {
        numbers.sort((a, b) => b - a);  // Descending order
    }

    // Display sorted numbers
    displaySortedNumbers(numbers);
}

function displaySortedNumbers(numbers) {
    const sortedNumbersList = document.getElementById('sortedNumbersList');
    sortedNumbersList.innerHTML = ''; // Clear previous list

    numbers.forEach(num => {
        const listItem = document.createElement('li');
        listItem.textContent = num;
        sortedNumbersList.appendChild(listItem);
    });
}
