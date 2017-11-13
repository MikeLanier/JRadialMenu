# JRadialMenu
A Java based utility which I can plug into any of my Java apps to give me control over that app.  
I thought this up while working on JMaze.  I was thinking of an on screen utility by which I could navigate through 
the maze. Rather than write something specific for that app, I decided to make it a generic utility which I could
use for any app.  

## Requirements: 

* A circular collection of commmands
* the commands on the radial menu will be defined by the parent app
* each commmand will consist of an id, title, descripition and icon
* a command can be an instruction to "do something" or a link to a sub set of
commmands
* clicking on a commmand will post a custom event which the parent app will
catch and process
* the number of commands on the radial menu will be variable and defined by the
parent app
* the radial menu will offer a variety of command button shapes (wedge, circle,
etc) from which the parent app can choose
* the radial menu will have the option to open/close or be always open
* the radial menu will be movable
* a command can have sub-commands.  Clicking one will cause additional command
buttons to 'bloom' out.  exactly how this will look is yet to be determined.
* The shape of the buttons will be defined by a user defined option.  Those
options being; a wedge, a circle, or whatever else I dream up
* The shape of the buttons can be changed after the radial menu has been
created
* radial menu functionality will be built into an external library
* options
  * number of commands. 2-10 for now
  * size will be defined by a inner and outer radius
    * for wedges, inner radius will be the bottom of the wedge, outer the top
    * for circles, outer less inner defines the diameter of the circle.  Mid point
    between the two, the center of the circle
  * when using circular buttons, the radial menu can collapse
  * collapability will be optional
  * radial menu can be moved by left mouse button down in the center and dragging
  * movability will be optional
* commands
  * ~~defined by a class whose member variables are id, title, description and icon~~
  * commands will be presented to the radial menu in a list
* ~~control panel: how the test harness exercises the radial menu. will contain
controls which define....~~
  * ~~the inner and outer radius~~
  * ~~the number of buttons/commands~~
  * ~~button shape~~
  * ~~collapsability~~
  * ~~movability~~
  * ~~commmands to display~~

## Implementation Diary

#### 11/13/2017
* move code from JRadialMenu.Testharness to JRadialMenu
* display SVG for icons rather than PNG
  * replace PNG with SVG on radial menu
  * find or make SVG for commands
* tooltips on the wedges
* circular wedges  
* BUG: cannot display command icon from the Wedge class

#### 10/19/2017
* ~~create custom commands/events~~
  * ~~post when wedge is clicked.~~ 
  * ~~add code to MainFrm or DisplayPanel to listen for commands/events posted
from the wedge~~
* ~~move images to Images folder~~
* display SVG for icons rather than PNG
  * ~~how to display SVG in Java~~
  * replace PNG with SVG on radial menu
  * find or make SVG for commands
* tooltips on the wedges
* circular wedges  
* BUG: cannot display command icon from the Wedge class

#### 10/18/2017
* ~~make the icon on the wedge mouse transparent~~
* ~~draw icons on the radial menu.  For now did this from the radialmenu panel rather
than from the wedge.  Tried making the wedge a Pane with a Path but some of the
wedges did not detect the mouse correctly.  Works better if the Wedge is a Path.
Works for now.  May revisit and try to find a better way~~
* ~~Given the inner radius, outer radius and number of commands, draw a radial
menu with empty buttons~~
* ~~Create radial menu class~~
  * ~~see if I can listen for an onPaint and auto update the display. (Was not able
  to google anything regarding listening for paint events.  Think about it later)~~
  * ~~extends Canvas~~
  * ~~allocate in MainFrm and add to 2nd column (in addition to display panel)~~
    * ~~I have two canvas' in the 2nd column, display panel and radialmenu.  The
    order in which they were added seems to determine who draws on top of the
    other.  Still need to make calls to update~~

#### 10/17/2017
* ~~icons for the commands~~
* ~~divide the test harness display into the control panel and display panel~~
* ~~add controls to the control panel to define....~~
  * ~~the number of commands~~
  * ~~the inner and outer radius~~
  * ~~the shape of the buttons~~
  * ~~the command list~~
  * ~~collapsability~~
  * ~~movability~~
