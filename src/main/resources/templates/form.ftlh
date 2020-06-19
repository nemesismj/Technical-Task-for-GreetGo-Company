<!Doctype html>
<html>
<head>
    <title>Mybatis Insert</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        .container{
            margin-top: 10px;
            max-width: 750px;
            margin-right: 350px;
        }
    </style>
</head>
<body>
<div class="container">
    <h5>Add New Employee</h5>
    <form action="/update" method="post">
        Name:<br/>
        <input type="text" class="form-control" name="fname" value="${st.fname}"/>
        <br/>
        Last Name:<br/>
        <input type="text" class="form-control" name="lname" value="${st.lname}"/>
        <br/>
        Department:<br/>
        <input type="text" class="form-control" name="department" value="${st.department}"/>
        <br/>
        <input type="hidden" name="id" value="${st.id}"/>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>