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
    //현재 도메인에 저장되어있는 모든 쿠키 가져오기
    Cookie []cookies=request.getCookies();
    boolean isLogin=false;//쿠키가 존재하면 true
    //저장된 쿠키가 하나도 없다면 null
    if(cookies!=null)
    {
        for(Cookie cook:cookies)
        {
            //쿠키이름 얻기
            String cookieName=cook.getName();
            //쿠키에 저장된 값 얻기
            String cookieValue=cook.getValue();
            System.out.println(cookieName+","+cookieValue);
            //loginok 라는 쿠키가 있고 값이 success가 들어있다면 성공적으로
            //로그인했다는 뜻(생성안된 상태서 널값일 경우 오류가 나기때문에
            //널 조건도 추가)
            if(cookieName.equals("loginok") && cookieValue!=null
                    && cookieValue.equals("success")){
                isLogin=true;
            }
        }
    }
%>
<body>
<%
    if (!isLogin) {
%>
<script type="text/javascript">
    alert("login first");
    // history.back();
    window.location.replace("cookiemain.jsp")
</script>
<%
//    response.sendRedirect("cookiemain.jsp");
} else {
%>
<pre>
미국 연방 보안당국은 대선 결과를 놓고 폭력 사태가 불거질 가능성에 만반의 대비를 갖추고 있다.
미국 정치전문매체 더힐은 이날 미국 이민세관단속국(ICE) 산하 국가안보통합센터(NSIC)가 지난주
내부적으로 발송한 이메일을 입수해 이 같이 보도했다.
NSIC는 대선 이후 수도 워싱턴D.C.에서 열릴 것으로 예상되는 시위를 주목하고 있다.
해당 이메일은 "11월 4~7일 워싱턴D.C. 시내에서 민간 소요사태가 계획돼 있다"며 4일 워싱턴D.C.로
모이라는 시위대의 소셜미디어 메시지를 모니터링하고 있다고 전했다.
보안당국은 만약의 경우에 대비해 백악관 주변에 울타리를 설치했다.
대선 결과가 어떻게 나오든 트럼프 대통령과 바이든 후보 지지자들 사이의 충돌로 폭력 사태가 발생할
가능성이 높아 보인다고 더힐은 지적했다.
뉴욕과 워싱턴D.C 등 미국 대도시의 일부 상점들은 창문에 합판을 설치하는 등 약탈에 대비하고 있다.
</pre>
<%
    }
%>

</body>
</html>
