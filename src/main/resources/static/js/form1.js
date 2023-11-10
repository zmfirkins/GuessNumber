document.addEventListener('DOMContentLoaded', function () {
    console.log("DOM is fully loaded.");
    const form = document.getElementById('form');
    const number = document.getElementById('number');

    form.addEventListener('submit', function (e) {
        if (!validateInput()) {
            e.preventDefault(); // Prevent form submission if validation fails
        }
    });

    function validateInput() {
        const numberValue = parseInt(number.value);

        if (isNaN(numberValue) || numberValue < 1 || numberValue > 10) {
            alert('Number must be between 1 and 10');
            return false; // Return false to indicate validation failure
        }
        return true; // Return true to indicate validation success
    }
});
