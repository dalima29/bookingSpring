<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prenotazioni in atto</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Prenotazioni correnti</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Prenotazioni</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div>

							<span><a href="${pageContext.request.contextPath}/cerca-disponibilita"><button
										type="button" class="btn btn-default btn-circle">
										<i class="fa fa-plus"></i>
									</button></a></span> <span>Aggiungi prenotazione</span>
						</div>

						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>Risorsa</th>
									<th>Nome Risorsa</th>
									<th>Nome Prenotazione</th>
									<th>Inizio</th>
									<th>Fine</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td align="center">Macchina</td>
									<td align="center">Toyota Yaris</td>
									<td align="center">Pippo</td>
									<td align="center">29-11-2021 09:00</td>
									<td align="center">29-11-2021 09:00</td>
									<td align="center"><button type="button"
											class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
								</tr>
								<tr class="gradeC">
									<td align="center">Portatile</td>
									<td align="center">Lenovo k5</td>
									<td align="center">Pluto</td>
									<td align="center">11-11-2011 10:00</td>
									<td align="center">12-11-2011 10:00</td>
									<td align="center"><button type="button"
											class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
								</tr>
								<tr class="gradeU">
									<td align="center">Aula</td>
									<td align="center">A5</td>
									<td align="center">Topolino</td>
									<td align="center">05-12-2018 10:00</td>
									<td align="center">05-12-2018 12:00</td>
									<td align="center"><button type="button"
											class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
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
</html>