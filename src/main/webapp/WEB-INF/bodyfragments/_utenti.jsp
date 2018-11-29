<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>Utenti</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Utenti registrati</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Utenti</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>Nome</th>
									<th>Cognome</th>
									<th>Email</th>
									<th>Username</th>
									<th>Password</th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td align="center">Andrea</td>
									<td align="center">Bonandin</td>
									<td align="center">ciao@gmail.com</td>
									<td align="center">pippo</td>
									<td align="center">123</td>
								</tr>
								<tr class="gradeC">
									<td align="center">Federica</td>
									<td align="center">Amato</td>
									<td align="center">riciao@gmail.com</td>
									<td align="center">pluto</td>
									<td align="center">456</td>
								</tr>
								<tr class="gradeU">
									<td align="center">Davide</td>
									<td align="center">Limardi</td>
									<td align="center">ririciao@gmail.com</td>
									<td align="center">topolino</td>
									<td align="center">789</td>
								</tr>
							</tbody>
						</table>
						<!-- /.table-responsive -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>