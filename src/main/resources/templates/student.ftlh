<!Doctype html>
<html>
<head>
    <title>MyBatis MySQL CRUD</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style>
        .container{
            margin-top: 10px;
            max-width: 750px;
            margin-right: 350px;
        }
        .container1 {
            margin-top: 10px;
            max-width:750px;
        }
    </style>

</head>
<body>

<div class="container">

    <h4>Greet Go</h4><br/>
    <h5>Student List</h5>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Department</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <#list students as st>
            <tr>
                <td>${st.id}</td>
                <td>${st.fname}</td>
                <td>${st.lname}</td>
                <td>${st.department}</td>
                <td>
                    <a href="/form?id=${st.id}" class="btn btn-info btn-sm" role="button">Update</a>
                    <a href="/delete?id=${st.id}" class="btn btn-danger btn-sm" role="button">Delete</a>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
    <div class="container1">
        <div id ="insertStudent">
        <h5>Add New Student</h5>
        <form action="/insert" method="post"  id="insert_form">
            Name:<br/>
            <input type="text" class="form-control" name="fname"/>
            <br/>
            Last Name:<br/>
            <input type="text" class="form-control" name="lname"/>
            <br/>
            Department:<br/>
            <input type="text" class="form-control" name="department"/>
            <br/>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        </div>
    </div>
</div>
<div class="col-sm-7" id="postResultDiv">
</div>

</body>
</html>