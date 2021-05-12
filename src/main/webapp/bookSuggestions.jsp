<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/27/21
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<!-- head-tag section -->
<c:import url="head-tag.jsp"/>
<!-- end head-tag -->


<!-- Body -->
<body>
<!-- header -->
<c:import url="header-logged-in.jsp" />
<!-- end header-->


<!-- main -->
<div class="splash-container">
    <div class="splash">
        <h1 class="splash-head">Book Suggestions!</h1>

        <p class="splash-subhead">
            Scroll through to see suggested books from various genres. Maybe you'll find a new favorite, or
            be tempted to explore a genre you typically stay away from!
        </p>
    </div>
</div>

<div class="content-wrapper">
    <div class="content">
        <h2 class="content-head is-center">Young Adult</h2>

        <div class="pure-g">
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>City of Bones By Cassandra Clare</i></h3>
                <p>
                    Clary Fray is seeing things : Vampires in Brooklyn and werewolves in Manhattan. Irresistibly drawn
                    by a group of sexy
                    demon hunters, Clary encounters the dark side of new york city - and the dangers of forbidden love.
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>Throne of Glass By Sarah J Maas</i></h3>
                <p>
                    This book is about a assassin that has to fight for her freedom and to be the king’s champion.
                    During the tests she competes against other criminals and avoid being killed by a mysterious killer
                    that rips their victims apart. Along the way the assassin finds herself falling in love with the
                    prince, befriending a princess that is not what she seems, discovering a plot, and throwing up her
                    lunch.
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>The Selection By Kiera Cass</i></h3>
                <p>
                    Sixteen-year-old America Singer is living in the caste-divided nation of Illea, which formed after
                    the war that destroyed the United States. America is chosen to compete in the Selection--a contest
                    to see which girl can win the heart of Illea's prince--but all she really wants is a chance for a
                    future with her secret love, Aspen, who is a caste below her"--
                </p>
            </div>
        </div>
    </div>
    <div class="ribbon l-box-lrg pure-g">
        <div class="ribbon-content l-box-lrg pure-u-1">
            <h2 class="content-head content-head-ribbon is-center">Romance</h2>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-2">
                <h3 class="content-subhead"><i>Captain Jack's Woman By Stephanie Laurents</i></h3>
                <p>
                    hey meet in a clash of swords, drenched in the moonlight of Britain's rugged eastern coast:
                    Captain Jack, his handsome features etched in silver and shadow, his powerful physique compelling
                    "Kit" Cranmer to surrender. He is her dream lover come vividly alive, and his command of the
                    smuggling gang is absolute. His all-knowing gaze penetrates her disguise as the "lad" leader of a
                    rival gang with frightening ease -- and his "punishment" with kisses leaves her maidenly modesty
                    in tatters. Suddenly Kit finds she's only too delighted to explore with Jack the pleasures
                    conventionally reserved for married ladies … little knowing what dangerous forces she's unleashing.
                    For even as Kit revels in midnight gallops and cottage rendezvous, Captain Jack is laying a gentle
                    trap that will curtail her freedom … and bind her to him with a ring, a promise …and ties of
                    devotion and desire.
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-2">
                <h3 class="content-subhead"><i>Shameless By Karen Robards</i></h3>
                <p>
                    Lady Elizabeth, the youngest and most headstrong of the three Banning sisters, has been engaged
                    three times, and has most scandalously broken off all three engagements. Neil Severin is a wicked
                    rogue, black of heart and black of reputation. A man of no morals, devoid of compassion, he is a
                    government-sanctioned assassin. When circumstances most unexpectedly throw the two together,
                    Beth's life is in danger and Neil finds himself in the unexpected role of hero, racing to save
                    her before it's too late.
                </p>
            </div>

        </div>

    </div>
    <!-- end main -->
    <!-- footer -->
    <c:import url="footer.jsp" />
    <!-- end footer -->
</div>

</body>
</html>