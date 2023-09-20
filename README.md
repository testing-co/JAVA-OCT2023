# Welcome to the JAVA stack with Heidi

## Schedule (Links are not available until that lecture is complete)
| Category | Reference | Remarks | Day|
|----------------- | -----------------| --------------| ----- |
| Fundamentals |  [Fundamentals](./Java1Fundamentals/)| | W1D1 |
| OOP | [OOP123](./Java2OOP/)| | W1D2 | 
|     |  [InheritanceDemo, InterfaceDemo](./Java2OOP/)| | W1D3 |
| Spring | [API & JSP](./Java3Spring/spring-jsp-demo)| | W1D5 |
|     |  [Session & Form](./Java3Spring/spring-session-form)| | W2D1 |
| Spring MVC |  [MVC](./Java4MVC)| | W2D2-3 |
| 1:N | [Notes](./Java4MVC/1nNotes.md)|  | W2D4 |
| Auth |  [PseudoCode](./Java5FullSpring/Auth)|| W2D5 |
| Full Spring |[Notes](./Java5FullSpring)| | | 



## Eclipse Shortcut
| Windows | Mac    | Functions |
|----------------- | -----------------| --------------|
| Alt + Shift S  | Command + Option+ S| Open Source to create getter/setter|
| Ctrl + Shift+ O  | Command + Shift +O | Autoimport |
| Ctrl + Shift + T | Command + Shift + T| Open / Search for types, very useful in finding classes|
| Alt + up/down | Option + up/down | Move the line up / down |
| Ctrl + Shift + F| Command + Shift + F | Auto-format | 
|Alt + Shift + R|Command + Option + R|Rename of package, class etc|


## Common errors

### To kill a running port
1. run the first command to get the PID of the port
2. kill the port with the PID. 

    #### **Mac/Linux**
    - to getting the background process and find the PID
    ```lsof -i:8080 ```

    - To kill the PID
    ```kill -9 <PID> ```

    #### **Windows**
    - to getting the background process and find the PID
    ```netstat -ano | findstr :8080```
    - To kill the PID
    ```taskkill /PID <PID> /F ```

