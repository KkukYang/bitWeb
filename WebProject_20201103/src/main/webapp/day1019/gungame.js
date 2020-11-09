$(function () {
    //1. 총을 클릭하면 0~11 사이의 값을 랜덤하게 발생하여
    //선반위의 해당 인형을 안보이게 처리한다.
    var tot = 0;
    var targetCnt = $(".sunban").children().length;

    $(".gun").click(function () {
        if (tot > targetCnt) {
            return;
        }

        var idx = parseInt(Math.random() * targetCnt);
        //idx가 발생하면 해당 인형이 이미 사라진 경우에는
        //n번 인형은 이미 처리되었습니다.
        //그렇지 않으면 n번인형을 맞췄네요
        //그러다가 모두 맞추면 게임오버 윈 라고 출력.

        if ($(".sunban li img").eq(idx).is(":hidden")) {
            console.log((idx + 1) + "번 인형은 이미 처리되었습니다.");
            $("#msg").text((idx + 1) + "번 인형은 이미 처리되었습니다.");
        } else {
            tot++;
            $(".sunban li img").eq(idx).fadeOut("fast").hide();
            $("#msg").text((idx + 1) + "번 인형을 맞췄네요.");
        }

        if (tot == targetCnt) {
            tot++;
            setTimeout(function () {
                $("#msg").text("GameOver You Win!!");
                // alert("GameOver You Win!!");
            }, 1000);
        }
    });

    //지폐를 클릭하면 해당 지폐는 안보이게 처리하고
    //인형은 모두 다시 보이게 하기, 메시지창도 지우기.
    $("ul.money li img").click(function () {
        $(this).hide();
        $("ul.sunban li img").show();
        $("#msg").empty();

        tot = 0;
        // $(".sunban li img").each(function(idx){
        //    $(this).show();
        // });
    });
});