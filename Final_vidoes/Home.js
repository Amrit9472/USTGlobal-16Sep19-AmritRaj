//validation
var email = document.forms['form']['email'];
var password = document.forms['form']['password'];

var email_error = document.getElementById('emailInput');
var password_error = document.getElementById('passwordInput');

email.addEventListener('textInput', email_verify);
password.addEventListener('textInput',password_verify)

function validated(){
    if(email.value.length < 9){
        email.style.border = "1px solid red";
        email_error.style.display ="block";
        email.focus();
        return false;
    }if(password.value.length < 6){
        password.style.border = "1px solid red";
        password_error.style.display ="block";
        password.focus();
        return false;
    }
    function email_verify(){
        if(email.value.length >= 8){
            email.style.border ="1px solid red";
            email_error.style.display = "block";
            email.focus();
            return true;
        }
        
    }function password_verify(){
        if(password.value.length >= 8){
            password.style.border ="1px solid red";
            password_error.style.display = "block";
            return true;
        }
    
    
}




