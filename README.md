# Isometric-Game

#### Lecturer: *John Healy*
#### Student Name: *Tianle Shu*
#### Student ID: *G00341565*
## *Introduction and Requests* 
Isometric projection is a technique for rendering 3D objects in 2D space by equally
foreshortening the X, Y and Z axes and maintaining an angle of 120° between them. While
isometric projection can be dated back to the 18th century, it became very common in the 19th
century as a technical drawing format. In video gaming, the technique allows graphics and
sprites developed using 2D Cartesian space to represent a 3D gaming environment, decreasing
the space complexity by a full order of magnitude. The first isometric video games emerged in
the early 1980's with arcade games such as Zaxxon (Sega, 1982) and Q*bert (Gottlieb, 1982)
and games designed for home computers, such as the ZX Spectrum and Commodore 64. The
latter included the groundbreaking isometric games Ant Attack (Quicksilva, 1983, see
http://torinak.com/qaop#!antattack) and the action-adventure game Knight Lore (Ultimate Play
the Game, 1984, see http://torinak.com/qaop#!knightlore). </br>

![Picture]()

You are required to implement an isometric game that challenges a player to complete some
type of quest. The game should end, with suitable celebration and fanfare, when the appropriate
player action fulfills the quest. </br>
A set of stub classes that implements the basic features of an isometric game is available on
Moodle, but deliberately badly designed. Your objective is to extend, modify and refactor the 
code provided to create an elegant game design. You should aim to accomplish the following
in your application: </br>
• Group together cohesive elements into methods, types and packages.  </br>
• Loosely-couple together all programme elements to the maximum extent possible. </br>
• Create a reusable set of abstractions that are defined by interfaces and base classes. </br>
• Encapsulate at method, type, package and module level. </br>
• Apply creational, structural and behavioural design patterns throughout the game where
appropriate. There are obvious uses for factories, builders, flyweights, observers and
proxies in an isometric game. </br>
• Use the Swing MVC framework to write custom sprites and game objects. </br>
You are free to asset-strip any online resources for images and functionality provided that you
modify any code used and cite the source both in the README and inline as a code comment
above the relevant section of the programme. You are not free to re-use whole components and
will only be given marks for work that you have undertaken yourself. Please pay particular
attention to how your application must be packaged and submitted and the scoring rubric
provided. Marks will only be awarded for features described in the scoring rubric.

## *Game Introduction*
There is a first window for people choose style of the sprite and level of the game.
+ The game view -- I use Factory design parttern and singleton design paettern for the two levels game window.
+ After the user choose sprite and game level , then game can begin. User can use arrow key for sprite direction , then 'X' key for go front one unit. If user reach the Well the window will jump a small window "you die" and there is a "restart" button can restart the game. If user reach box will jump a small win window. As well as that, you just can move on the game map.Cannot move out the map bound.

