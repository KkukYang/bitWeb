<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    boolean isLogin = false;
    String loginok = (String) session.getAttribute("loginok");
    if (loginok != null) {
        isLogin = true;
    }
%>
<body>
<%
    if (!isLogin) {
%>
<script type="text/javascript">
    alert("login first");
    // history.back();
    window.location.replace("sessionmain.jsp")
</script>
<%
    //    response.sendRedirect("sessionmain.jsp");
} else {
%>
<pre>
이날 블루칩(우량주) 클럽인 다우존스산업평균지수는 전날보다 554.98포인트(2.06%)
뛴 2만7480.03에 거래를 마쳤다.
대형주 위주의 S&P(스탠더드앤드푸어스) 500 지수는 58.92포인트(1.78%) 상승한
3369.16을 기록했다. 역대 대선일 가운데 두번째로 높은 상승률이다.
기술주 중심의 나스닥종합지수는 202.96포인트(1.85%) 오른 1만1160.57로 마감했다.
애플과 아마존, 페이스북 모두 1% 이상 올랐고, 테슬라는 5% 넘게 뛰었다.
내셔널증권의 아트 호건 수석전략가는 "누가 당선되든 분명한 승자가 나오는 게 주식시장
입장에선 좋다"며 "대선 결과 확정이 하루 정도 늦어지는 건 괜찮지만 일주일 이상
미뤄지고 소송이나 재검표로 가는 건 최악의 시나리오가 될 것"이라고 말했다.
시장은 전국 지지율에서 앞서는 조 바이든 민주당 후보의 당선에 무게를 두고 있다. 또
상원에서도 민주당이 다수당 지위를 탈환하는 '블루웨이브'(민주당을 상징하는 색인
파랑 물결)의 실현 가능성을 높게 본다.
이 경우 그동안 민주당이 추진해온 2조2000억 달러(약 2500조원) 규모의 대형 부양책이
처리될 것으로 시장은 기대하고 있다. 민주당 주도의 하원을 이미 통과한 이 부양안은
주정부 등 지방정부 지원을 반대하는 공화당에 가로막혀 상원 문턱을 넘지 못하고 있다.
그러나 바이든 후보가 승리하더라도 도널드 트럼프 미국 대통령이 불복하면서 결과 확정이
장기간 미뤄질 가능성도 없지 않다.
</pre>
<%
    }
%>

</body>
</html>
