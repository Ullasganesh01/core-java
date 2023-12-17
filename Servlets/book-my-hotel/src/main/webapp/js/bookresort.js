function validateName(){
    let nameEle = document.getElementById("name");
    let name = nameEle.value.trim();
    let nameErr = document.getElementById("name-error");
    let isNameValid = false;
    const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
    if(name===" " || name.length<3){
        nameErr.innerHTML = "Must be at least 3 characters";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else if(!nameRegex.test(name)){
        nameErr.innerHTML = "Must contain only alphabets";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else{
        nameErr.style.display = "none";
        nameEle.style.border = "2px solid green";
        isNameValid = true;
    }
    return isNameValid;
}

function validateLastName(){
    let nameEle = document.getElementById("lname");
    let name = nameEle.value.trim();
    let nameErr = document.getElementById("lname-error");
    let isNameValid = false;
    const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
    if(name===" " || name.length<3){
        nameErr.innerHTML = "Must be at least 3 characters";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else if(!nameRegex.test(name)){
        nameErr.innerHTML = "Must contain only alphabets";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else{
        nameErr.style.display = "none";
        nameEle.style.border = "2px solid green";
        isNameValid = true;
    }
    return isNameValid;
}

function validateEmail(){
    let emailEle = document.getElementById("email");
    let email = emailEle.value.trim();
    let emailErr = document.getElementById("email-error");
    let isEmailValid = false;
    const emailRegex =/^[^\s@]+@[^\s@]+\.[^\s@]+$/;    
    if(email ===" " || email.length<1){
        emailErr.innerHTML = "Email cannot be empty";
        emailEle.style.border = "2px solid red";
        emailErr.style.display = "inline";
        isEmailValid = false;
    }else if(!emailRegex.test(email)){
        emailErr.innerHTML = "Must be in the format <br> of abc@example.com";
        emailEle.style.border = "2px solid red";
        emailErr.style.display = "inline";
        isEmailValid = false;
    }else{
        emailErr.style.display = "none";
        emailEle.style.border = "2px solid green";
        isEmailValid = true;
    }
    return isEmailValid;
}

function validateContactNo(){
    let contactEle = document.getElementById("contactno");
    let contact = contactEle.value.trim();
    let contactErr = document.getElementById("contact-error");
    let iscontactValid = false;
    const contactRegex = /^\d{10}$/;
    if(contact ===" "){
        contactErr.innerHTML = "Contact Number cannot be empty";
        contactEle.style.border = "2px solid red";
        contactErr.style.display = "inline";
        iscontactValid = false;
    }else if(!contactRegex.test(contact)){
        contactErr.innerHTML = "Should contaion only 10 digits";
        contactEle.style.border = "2px solid red";
        contactErr.style.display = "inline";
        iscontactValid = false;
    }else{
        contactErr.style.display = "none";
        contactEle.style.border = "2px solid green";
        iscontactValid = true;
    }
    return iscontactValid;
}

function validateComments(){
    let commentsEle = document.getElementById("comments");
    let comments = commentsEle.value.trim();
    let commentsErr = document.getElementById("comments-error");
    let isCommentValid = false;
    if(comments ===" " || comments.length<25){
        commentsErr.innerHTML = "Comment cannot be empty";
        commentsEle.style.border = "2px solid red";
        commentsErr.style.display = "inline";
        isCommentValid = false;
    }else{
        commentsErr.style.display = "none";
        commentsEle.style.border = "2px solid green";
        isCommentValid = true;
    }
    return isCommentValid;
}

function validateAdults(){
    let adultsEle = document.getElementById("adults");
    let adults = adultsEle.valueAsNumber;
    let adultsErr = document.getElementById("adults-error");
    let isAdultValid = false;
    if(isNaN(adults) || adults<1){
        adultsErr.innerHTML = "Atleast one adult required";
        adultsEle.style.border = "2px solid red";
        adultsErr.style.display = "inline";
        isAdultValid = false;
    }else{
        adultsErr.style.display = "none";
        adultsEle.style.border = "2px solid green";
        isAdultValid = true;
    }
    return isAdultValid;
}

function validateRooms(){
    let roomsEle = document.getElementById("rooms");
    let rooms = roomsEle.valueAsNumber;
    let roomsErr = document.getElementById("rooms-error");
    let isroomsValid = false;
    if( isNaN(rooms) || rooms<1){
        roomsErr.innerHTML = "Atleast one room required";
        roomsEle.style.border = "2px solid red";
        roomsErr.style.display = "inline";
        isroomsValid = false;
    }else{
        roomsErr.style.display = "none";
        roomsEle.style.border = "2px solid green";
        isroomsValid = true;
    }
    return isroomsValid;
}

function validateForm(){
    if(validateName()  && validateLastName() && validateEmail() && validateContactNo() && validateComments() && validateAdults() &&validateRooms()){
        return true;
    }
    else{
        return false;
    }
}
// const emailRegex =/^[A-Za-z!#$%&'*+\-/=?^_`{|}~]+@[A-Za-z]+\.[A-Za-z]{2,}$/;