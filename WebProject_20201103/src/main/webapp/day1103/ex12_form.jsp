<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>오라클 테스트</h2>
<form action="ex12_action.jsp" method="post">
	<h3>1. 다음중 DML 명령어에 속하지 않는 SQL명령어는(5점)?</h3>
	<input type="radio" name="no1" value="5">create
	<input type="radio" name="no1" value="0">insert
	<input type="radio" name="no1" value="0">delete
	<input type="radio" name="no1" value="0">update
	<br><br>
	<h3>	
    2. 다음중 EMP 테이블에서 job 의 종류중 중복되는 job 은 제거하고<br>
	한번만 출력하기 위해서 괄호안에 들어가는 SQL명령어는(5점)?<br>
	select (       ) job from emp;</h3>		
	<input type="radio" name="no2" value="0">group
	<input type="radio" name="no2" value="5">distinct
	<input type="radio" name="no2" value="0">unique
	<input type="radio" name="no2" value="0">one
	<br><br>
	<h3>
	3. EMP테이블에서 평균 sal 보다 연봉이 더 높은 사람의 name과 job을<br>
	출력하려고 한다.<br>
	다음중 알맞은 SQL 명령어는(20점)?
    </h3>		
	<input type="radio" name="no3" value="0">
		select name,job from emp where sal>avg(sal)<br>
	<input type="radio" name="no3" value="0">
		select name,job from emp sal>(select * from emp)<br>
	<input type="radio" name="no3" value="20">
		select name,job from emp where sal>(select avg(sal) from emp)<br>
	<input type="radio" name="no3" value="0">
		select name,job from emp sal>(select sum(sal) from emp)
	<br><br>
	<h3>	
    4. system 계정에서 angel 계정을 만든후 기본 권한을 주려고 한다<br>
    	괄호안에 들어가는 명령어로 올바른것은(70점)?<br>
    	grant (  1  ),(   2  ) to angel;</h3>		
	<input type="radio" name="no4" value="0">create,update
	<input type="radio" name="no4" value="0">add,add
	<input type="radio" name="no4" value="0">connect,create
	<input type="radio" name="no4" value="70">connect,resource
	<br><br>
	<b>작성자:</b>
	<input type="text" name="name" size="6" required="required">
	<br><br>
	<button type="submit" style="font-size: 1.5em;margin-left: 100px;">
	점수 알아보기</button>
</form>
</body>
</html>













