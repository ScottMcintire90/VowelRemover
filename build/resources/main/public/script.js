function revealOriginal() {
    document.getElementById("input-sentence").classList.remove('hidden');
}

var revealForm = document.querySelector("form");
revealForm.addEventListener("submit", function(event) {
    event.preventDefault();
    revealOriginal();
});
