*** Abstract ***

LiferayOne is generated by creating a new Liferay project using Liferay IDE plugin of Eclipse.

Once deployed, it is available under Sample category.

It does not do much, except simply displaying "This is the LiferayOne portlet." once dropped into a page.

It also support deletion, (re-)placement/movement of the portlet, look and feel as well as configuration, out of the box (default liferay features).

*** Customization ***

NewPortlet is created with Eclipse Liferay IDE with the following settings:

. Edit and Help in Portlet Mode checked
. The original content of view.jsp is changed from:

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>NewPortlet</b> portlet in View mode.

to the one that looks like the one at http://www.liferay.com/documentation/liferay-portal/6.0/development/-/ai/writing-the-my-greeting-portlet

