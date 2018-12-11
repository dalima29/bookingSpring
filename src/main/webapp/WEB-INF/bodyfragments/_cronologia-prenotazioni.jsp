<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cronologia Prenotazioni</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Cronologia prenotazioni</h1>
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
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th style="text-align: center">Id</th>
									<th style="text-align: center">Nome risorsa</th>
									<th style="text-align: center">Nome</th>
									<th style="text-align: center">Inizio</th>
									<th style="text-align: center">Fine</th>
								</tr>
							</thead>
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
	<script>
		$(document)
				.ready(
						function() {
							$('#dataTables-example')
									.DataTable(
											{
												"ajax" : "/user/getcronologialist",
												"columns" : [
														{
															className : "right",
															"data" : "id"
														},
														{
															"data" : "risorsa"
														},
														{

															"data" : "nomeP"

														},
														{
															"data" : "inizio",
															"render" : function(
																	data, type,
																	row) {
																var x = new Date(
																		data);
																var monthNames = [
																		"January",
																		"February",
																		"March",
																		"April",
																		"May",
																		"June",
																		"July",
																		"August",
																		"September",
																		"October",
																		"November",
																		"December" ];
																var day = x
																		.getDate();
																var monthIndex = x
																		.getMonth();
																var year = x
																		.getFullYear();
																var ore = x
																		.getHours();
																var minuti = x
																		.getMinutes();
																if (ore < 10) {
																	ore = '0'
																			+ ore;
																}
																if (minuti < 10) {
																	minuti = '0'
																			+ minuti;
																}

																return year
																		+ ' '
																		+ monthNames[monthIndex]
																		+ ' '
																		+ day
																		+ ' '
																		+ ore
																		+ ':'
																		+ minuti;

															}
														},
														{
															"data" : "fine",
															"render" : function(
																	data, type,
																	row) {
																var x = new Date(
																		data);
																var monthNames = [
																		"January",
																		"February",
																		"March",
																		"April",
																		"May",
																		"June",
																		"July",
																		"August",
																		"September",
																		"October",
																		"November",
																		"December" ];
																var day = x
																		.getDate();
																var monthIndex = x
																		.getMonth();
																var year = x
																		.getFullYear();
																var ore = x
																		.getHours();
																var minuti = x
																		.getMinutes();
																if (ore < 10) {
																	ore = '0'
																			+ ore;
																}
																if (minuti < 10) {
																	minuti = '0'
																			+ minuti;
																}

																return year
																		+ ' '
																		+ monthNames[monthIndex]
																		+ ' '
																		+ day
																		+ ' '
																		+ ore
																		+ ':'
																		+ minuti;

															}
														} ]

											});

						});
	</script>
	<style>
.left {
	text-align: left;
}

.right {
	text-align: right;
}

.center {
	text-align: center;
}
</style>
</body>
</html>