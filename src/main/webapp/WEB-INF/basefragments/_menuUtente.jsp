<!DOCTYPE html>
<html>
<head>
<title>Utente</title>
</head>
<body>
	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<li class="sidebar-search">
					<div class="input-group custom-search-form">
						<input type="text" class="form-control" placeholder="Search...">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div> <!-- /input-group -->
				</li>
				<li><a href="${pageContext.request.contextPath}/homeUtente"><i
						class="fa fa-dashboard fa-fw"></i> Dashboard</a></li>
				<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
						Charts<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="flot.html">Flot Charts</a></li>
						<li><a href="morris.html">Morris.js Charts</a></li>
					</ul> <!-- /.nav-second-level --></li>
				<li><a href="${pageContext.request.contextPath}/cerca-disponibilita"><i
						class="fa fa-search-plus fa-fw"></i> Cerca disponibilità</a></li>
				<li><a href="${pageContext.request.contextPath}/prenotazioni-in-atto"><i
						class="fa fa-history fa-fw"></i> Prenotazioni correnti</a></li>
				<li><a href="${pageContext.request.contextPath}/cronologia-prenotazioni"><i
						class="fa fa-th-list fa-fw"></i> Cronologia prenotazioni</a></li>
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i> UI
						Elements<span class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="panels-wells.html">Panels and Wells</a></li>
						<li><a href="buttons.html">Buttons</a></li>
						<li><a href="notifications.html">Notifications</a></li>
						<li><a href="typography.html">Typography</a></li>
						<li><a href="icons.html"> Icons</a></li>
						<li><a href="grid.html">Grid</a></li>
					</ul> <!-- /.nav-second-level --></li>
			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
	<!-- /.navbar-static-side -->
	</nav>
</body>
</html>