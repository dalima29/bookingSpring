<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
 
<body>
    <table width="100%">
        <tr>
            <td colspan="2">
                <tiles:insertAttribute name="header" />
            </td>
        </tr>
        <tr>
            <td width="1%" valign="top" nowrap="nowrap">
                 <tiles:insertAttribute name="menu" />
             </td>
            <td width="99%">
                 <tiles:insertAttribute name="body" />
             </td>
        </tr>
<!--        <tr>
            <td colspan="2">
                 <tiles:insertAttribute name="footer" />
            </td>
        </tr>-->
    </table>
</body>
</html>