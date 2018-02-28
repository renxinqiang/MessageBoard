$('#submit').click(function(){
    var user    = $('#user').val(),
        email   = $('#email').val(),
        phone   = $('#phone').val(),
        message = $('#message').val();
    var url = "http://localhost:8000/addMessage",
        data = {
            user    : user,
            email   : email,
            phone   : phone,
            message : message
        };
    $.ajax({
        url: url,
        data: data,
        success: function(msg){
            window.location.href = "http://localhost:8000/message.html";
        }
    });
});