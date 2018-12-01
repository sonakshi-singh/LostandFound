<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requester</title>
        <script>
                    function myFunction()
                    {
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 3000);
                    }
        </script>

    </head>
    <body class="bg site">
        <%@include file="UItemplate/headTag.jsp" %>
        <%@include file="UItemplate/header.jsp" %>
        
        <h1 style=" color: blue; text-align:center;">Issue Request</h1><br><br>

        <form name="form" action="issuePass"  method="post" align="center" class=".form-horizontal" >
            
                <center><table>
                    <tr><td style="font-size: 20px"><label class=".control-label">Name</label></td>
                        <td><input  class=".form-control" type="text" style="font-size:75%" name="Name" required></td></p></tr><br>
                    
                     <tr><td style="font-size: 20px"><label class=".control-label">Lost Item</label></td>
                     <td><input  class=".form-control" type="text" style="font-size:75%" name="LostItem" required></td></tr>

                     <tr><td style="font-size: 20px"><label class=".control-label">Location</label></td>
                         <td><input  class=".form-control" type="text" style="font-size:75%" name="Location" required></td></tr>

                     <tr> <td style="font-size: 20px"><label class=".control-label">Details of the item</label>&nbsp&nbsp</td>
                         <td><textarea  class=".form-control" name="Details" style="font-size:75%"></textarea></td></tr>

                <tr><td style="font-size: 20px"><label class=".control-label">Date </label></td>
                    <td><input  class=".form-control" name="Date" type="date"></td><br><br></tr>
 
                <tr><td style="font-size: 15px" colspan="2"><input  class=".form-control" data-toggle="tooltip" title="Submit" onclick="myFunction()" type="submit" value="Send Request" /> 
                    <div id="snackbar">Request Sent</div></td></tr>

                    </table></center>
        </form>

    </body>
    <%@include file="UItemplate/footer.jsp" %>
</html>
