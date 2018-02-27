$('#submit').click(function(){
    var user    = $('#user').val(),
        email   = $('#email').val(),
        phone   = $('#phone').val(),
        message = $('#message').val();
    var url = "http://localhost:8000/save",
        data = {
            user    : user,
            email   : email,
            phone   : phone,
            message : message
        };
    $.post(url,data,function(data){
        console.log(data);
    });
});