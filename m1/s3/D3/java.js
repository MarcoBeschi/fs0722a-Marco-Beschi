document.querySelector('#button').onclick = function () {
    if (document.querySelector('#header input').value.length == 0) {
        alert("inserisci un testo")
    }

    else {
        document.querySelector('#lista').innerHTML += `
            <div class="sottoLista">
                <span id="contenuto">
                    ${document.querySelector('#header input').value}
                </span>
                <button class="delete"></button>
            </div>
        `;

        var testo = document.querySelectorAll(".delete");
        for (var i = 0; i < testo.length; i++) {
            testo[i].onclick = function () {
                this.parentNode.remove();
            }
        }
    }
}
