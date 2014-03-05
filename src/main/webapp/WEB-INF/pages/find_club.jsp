<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<div class="container-fluid">--%>
    <%--<div class="row-fluid">--%>
        <div class="span1 offset2">
            <div>
                <a href="/Univ/create_group_form"><button class="btn" type="button">Create Group</button></a>

            </div>
            <div>
                <div class="left-nav-title">Others</div>
                <div class="left-nav-list">
                    <c:forEach items="${subCategories}" var="subCategory">
                        <div>${subCategory.name}(15)</div>
                    </c:forEach>
                </div>
                <a href="#"><small>see more</small></a>
            </div>



            <div>
                <div class="left-nav-title">Open range</div>
                <label class="checkbox">
                    <input type="checkbox"> Public
                </label>
                <label class="checkbox">
                    <input type="checkbox"> Private
                </label>
            </div>

            <div>
                <div class="left-nav-title">Applicable</div>
                <label class="checkbox">
                    <input type="checkbox"> open
                </label>
                <label class="checkbox">
                    <input type="checkbox"> closed
                </label>
            </div>



        </div>
        <div class="span5">

            <div>
                <ul>
                    <li>
                        <div id="group-content-header">
                            <div id="group-navigation">University of Waterloo / </div>
                            <div id="group-sort">
                                Sort by
                                <select class="span5">
                                    <option value="1">Date</option>
                                    <option value="2">Popularity</option>
                                    <option value="2">Members</option>
                                </select>
                                <a class="btn btn-small"><i class=" icon-arrow-up"></i></a>
                                <a class="btn btn-small"><i class=" icon-arrow-down"></i></a>
                            </div>
                        </div>
                    </li>
                    <c:forEach items="${groups}" var="group">
                        <li><div class="group-box">

                            <div class="group-img">
                                <img src="${pageContext.request.contextPath}/resources/img/effel.jpg" alt="effel tower">
                            </div>
                            <div class="group-content">
                                <div class="group-create">Created: Jan-04-2014</div>
                                <div class="group-info">
                                    <div class="group-name"><c:out value="${group.name}"/></div>
                                    <div class="group-leader">Leader: ${group.leaderName}</div>
                                    <div class="group-member">Members: 0 </div>
                                </div>
                            </div>
                        </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="span2">
            <a href="/Univ/create_event_form"><button class="btn" type="button">Create Event</button></a>

            <div class="group-event">
                <div class="see-all"> See All</div>
                <div class="event-head"><i class="icon-calendar"></i> Upcoming Events</div>
            </div>
            <c:forEach items="${events}" var="event">
                <div>
                    <div class="group-event-date">
                        <div class="group-event-schedule">Nov<div>14th</div></div>
                        <div class="group-event-content">
                            <div class="group-event-clubname"><c:out value="${event.title}"/></div>
                            <div class="group-event-type">Indoor Soccer Game</div>
                            <div class="group-event-time">7 PM - 9 PM</div>
                        </div>
                    </div>
                </div>
            </c:forEach>

            <div class="addition-li"> View More...</div>
            <%--<div class="Suggestion">--%>
                <%--<i class="icon-user"></i>Suggested Clubs & Teams <div class="see-all">See All</div>--%>
            <%--</div>--%>
            <%--<div class="group-suggest">--%>
                <%--<div class="group-image-suggestion">--%>
                    <%--<img src="resources/img/hospital.jpg" alt="Health">--%>
                <%--</div>--%>
                <%--<div class="group-name-suggest"> God of Gaw Top</div>--%>
            <%--</div>--%>
            <%--<div class="group-suggest">--%>
                <%--<div class="group-image-suggestion">--%>
                    <%--<img src="resources/img/medical.jpg" alt="meduc">--%>
                <%--</div>--%>
                <%--<div class="group-name-suggest"> Medicine</div>--%>
            <%--</div>--%>
            <%--<div class="group-suggest">--%>
                <%--<div class="group-image-suggestion">--%>
                    <%--<img src="resources/img/effel.jpg" alt="tour">--%>
                <%--</div>--%>
                <%--<div class="group-name-suggest"> La Swiss</div>--%>
            <%--</div>--%>
        </div>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>