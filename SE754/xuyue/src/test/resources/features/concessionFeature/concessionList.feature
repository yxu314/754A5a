Feature: Concession List. A linked list designed to keep courses that chosen by students


Scenario Outline: Concession List
Given A <Student> with basic information
And <Course> with basic information
When student add that <Course> to her/her concession
Then <ConcessionList> should show all concessions one's have

Examples:
| Student | Course | Course | ConcessionList |
| Minh    |  COMP  | COMP   |    COMP        |
| Minh    |  SE745 | SE745  |    COMP SE745  |
| Minh    |  K117  | K117   |COMP SE745 K117 |