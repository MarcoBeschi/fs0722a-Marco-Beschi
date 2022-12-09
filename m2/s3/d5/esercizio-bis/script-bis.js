fetch("./users2.json")
.then((response)=>response.json())
.then((users)=>
{
    for (let element of users){
        let card=document.createElement("div");
        let img=document.createElement("span");
        let divCard=document.createElement("div");
        let name=document.createElement("p");
        let mail=document.createElement("span");
        card.classList.add("card");
        img.innerHTML = `<img src=${element.profileURL}>`;
        mail.innerHTML = `<a href=mailto:${element.email}>${element.email}</a>`;
        name.innerHTML = `${element.firstName} ${element.lastName}`;
        document.querySelector(".contenitore").appendChild(card);
        divCard.appendChild(name);
        divCard.appendChild(mail);
        card.appendChild(img);
        card.appendChild(divCard);
    }
})