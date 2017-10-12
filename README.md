# JRadialMenu
A Java based utility which I can plug into any of my Java apps to give me control over that app.  
I thought this up while working on JMaze.  I was thinking of an on screen utility by which I could navigate through 
the maze. Rather than write something specific for that app, I decided to make it a generic utility which I could
use for any app.  

## Requirements: 

* A circular collection of commmands
* the commands on the radial menu will be defined by the parent app
* clicking on a commmand will post a custom event which the parent app will catch and process
* the number of commands on the radial menu will be variable and defined by the parent app
* the radial menu will offer a variety of command button shapes (wedge, circle, etc) from which the parent app can choose
* the radial menu will have the option to open/close or be always open
* the radial menu will be movable
* a command can have sub-commands.  Clicking one will cause additional command buttons to 'bloom' out.  exactly how
this will look is yet to be determined.
