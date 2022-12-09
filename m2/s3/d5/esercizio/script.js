async function loadJSON (url) {
    const res = await fetch(url);
    return await res.json();
  }
  
  loadJSON('./users.json').then(data => {
    let i = 0
    let img = document.querySelectorAll('.img')
    let array = document.querySelectorAll('.utente')
    for (let dato of data) {
        let name = dato.firstName + ' ' + dato.lastName
        let txtNome = document.createElement('p')
        txtNome.innerText = name
        array[i].appendChild(txtNome)

        let mail = dato.email
        let txtMail = document.createElement('a')
        txtMail.innerText = mail
        txtMail.style.fontSize='1.3rem'
        array[i].appendChild(txtMail)
        img[i].setAttribute("src",dato.profileURL)
        i++
    }
  });