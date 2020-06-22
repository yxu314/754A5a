Feature: Concession Approval

Scenario: Aadministrator should be able to approve course's concession of the students

Given Students basic information include ID name and age
And Course's information include title requirements status
When Administrator set course's status from false to true
Then The course's current status should be true