<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hero Form</title>
<link rel="stylesheet" href="style.css"></link>
</head>
<body>

	<div class="container">
		<h2>Hero Form</h2>
		<form action="redirect" method="post">
			<table>
				<tr>
					<td>
						<label for="id">ID</label>
					</td>
					<td>
						<input type="number" min="1" name="id" id="id" value="0" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label for="name">Name</label>
					</td>
					<td>
						<input type="text" id="name" name="name" value="" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label for="role">Role</label>
					</td>
					<td>
						<select id="role" name="role">
							<option value="">Select Role</option>
							<option value="Tank">Tank</option>
							<option value="Marksman">Marksman</option>
							<option value="Assassin">Assassin</option>
							<option value="Fighter">Fighter</option>
							<option value="Mage">Mage</option>
							<option value="Support">Support</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<label for="skill">Skill</label>
					</td>
					<td>
						<input type="number" min="4" id="skill" name="skill" value="0" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label for="difficulty">Difficulty</label>
					</td>
					<td>
						<input type="checkbox" id="difficulty" name="difficulty">
					</td>
				</tr>
				
				<tr>
					<td></td>
					<td>
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>