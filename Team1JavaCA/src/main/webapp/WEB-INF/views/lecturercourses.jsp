<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link href="<c:url value='/css/style.css'/>" rel="stylesheet"
	type="text/css" />


	<table class="borderAll">
		<tr>
			<th><s:message code="label.course.course_id_pk" /></th>
			<th><s:message code="label.course.name" /></th>
		
		</tr>
		<c:forEach var="lecturercourse" items="${lecturercourse}" varStatus="status">
			<tr class="${status.index%2==0?'even':'odd'}">
				<td class="nowrap">${status.index}</td>
				<td class="nowrap">${course.course_id_pk}</td>
				<td class="nowrap">${course.name}</td>
				<td align="center">
			</tr>
		</c:forEach>
	</table>
