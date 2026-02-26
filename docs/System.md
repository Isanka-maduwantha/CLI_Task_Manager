## Functions
    - Add Task
    - Remove Task
    - Edit Task
    - Search Tasks
    - Mark Complete
    - Save/Load Tasks
 

## Class
    Task

## Use Cases

### use case 1 (Add Task)
    Actor: user
    Goal: Create a New Task

#### Main Flow
    1. User Select Add Task
    2. System Ask For Title
    3. User Enters Title
    4. system valitate title is not empty
    5. system creates new task
    6. system adds it to task manager
    7. system confirm success
#### Alternative Flow (Error)
    - If title is Emply Show Error
  
### use case 2 (Remove Task)
    1. User Select Remove Task
    2. System Lists Current Tasks
    3. User Enter a Task Number
    4. system validate task exist
    5. system ask permission
    6. user enter y/yes 
    7. system remove task
    8. system confirm removeal


#### Alternative Flow 
    (Error)
    - If task dosent exist show error

    (No)
    - If user enters n/no Task Removeal Stops


### use case 3 (Edit Task)
    1. User Select Edit Task
    2. System Lists Current Tasks
    3. User Enter a Task Id
    4. system validate task exist
    5. system list editable task attributes
    6. user select task attribute
    7. system ask for new value
    8. user enters new value 
    9. system confirm sucess
    10. step 5 - 9
    11. user enter q
    12. system quit task edit

#### Alternative Flow 
    (Error)
    - If task id dosent exist show error
    - if new Values are emply system show error

### use case 4 (Search Task)
    1. user Select search task
    2. system ask for title
    3. user enter title
    4. system validate task with title exist
    5. system shows task details

#### Alternative Flow 
    (Error)
    - If task title dosent exist show error

### use case 5 (mark complete)

    1. User selects task
    2. System marks it complete
    3. System confirms complete
   

## Error Handling
    - id dosent exist - "Task Id Entered Dosent Exist, Enter Valid Id"
    - empty Title - "Title Cannot be Empty"



    