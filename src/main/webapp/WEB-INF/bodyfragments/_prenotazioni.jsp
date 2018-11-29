<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>prenotazioni</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Prenotazioni</h1>
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
									<th>Risorsa</th>
									<th>Nome</th>
									<th>Utente</th>
									<th>Nome Prenotazione</th>
									<th>Inizio</th>
									<th>Fine</th>
								</tr>
										<!--  					<tr>
									<th>Id</th>
									<th>Limite</th>
									<th>Nome</th>
									<th>Tipo</th>
								</tr>-->
							</thead>
<!--  							<tbody>
								<tr class="odd gradeX">
									<td align="center">Macchina</td>
									<td align="center">Toyota Yaris</td>
									<td align="center">Andrea Bonandin</td>
									<td align="center">Pippo</td>
									<td align="center">25-12-2018 09:00</td>
									<td align="center">25-12-2018 11:00</td>
								</tr>
								<tr class="gradeC">
									<td align="center">Portatile</td>
									<td align="center">Lenovo k5</td>
									<td align="center">Federica Amato</td>
									<td align="center">Pluto</td>
									<td align="center">25-12-2018 09:00</td>
									<td align="center">25-12-2018 11:00</td>
								</tr>
								<tr class="gradeU">
									<td align="center">Aula</td>
									<td align="center">A5</td>
									<td align="center">Davide Limardi</td>
									<td align="center">Topolino</td>
									<td align="center">25-12-2018 09:00</td>
									<td align="center">25-12-2018 11:00</td>
								</tr>
							</tbody>-->
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
	    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="../vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="../vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            "ajax": "dati/prenotazioni.json",
           	"columns": [
                    { "data": "risorsa" },
                    { "data": "nome" },
                    { "data": "utente" },
                    { "data": "nome prenotazione" },
                    { "data": "inizio" },
                    { "data": "fine" }
        ]
        });
    });
    </script>
    <!-- 
    <script>
    $(document).ready(function() {
        var table = $('#dataTables-example').DataTable({
            "sAjaxSource": "/getrisorselist",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
           	"aocolumns": [
                    { "mdata": "id" },
                    { "mdata": "limite" },
                    { "mdata": "nome" },
                    { "mdata": "tipo" }
        ]
        });
    });
    </script>-->
</body>