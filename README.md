# ATeam

Our goal is to make a Help Desk, which seeks to help all the naive customers with their tech needs and fire memes. 

## ArrayPriorityQueue

We have the ArrayPriorityQueue as the underlying data structure for the Help Desk class. As an added design choice, we've made it so that comprable compares the VIPlvl of the Ticketer instead of their natural order (i.e. 1 -> 2 -> 3 )

## Ticket

The ticket class ended up being just a bunch of mutators and accessors, but it's used as the general type form for the Help Desk

## Help Desk

The Help Desk is where all of your answers are solved. With the same generic response. Over and over again. There's a create method, which fills the APQ with the problems of the people, and a solve method, which doesn't actually solve anything but for our intents and purposes it does. 

## Errors

The Tickets added into the APQ in HelpDesk are duplicated.

