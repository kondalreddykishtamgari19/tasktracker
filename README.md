# TaskTracker - Console-based Task Manager (CRUD App)

**TaskTracker** is a simple Java console application that helps you manage a list of tasks using basic CRUD operations — **Create, Read, Update, and Delete**. It's lightweight, user-friendly, and perfect for learning the fundamentals of object-oriented programming and data manipulation in Java.

---

## 🚀 Features

- ✅ **Create** new tasks with a title and description  
- 📄 **Read/View** all existing tasks  
- 🔁 **Update** existing task details by their unique ID  
- ❌ **Delete** tasks using their ID  
- 🖥️ Console-based interactive menu system

---

## 🛠️ Built With

- **Language:** Java  
- **Tools:** Java SDK, Terminal/Command Prompt  
- **Storage:** In-memory (`ArrayList`)

---

## 📂 File Structure

```text
TaskTracker/
│
├── Task.java          # Task model class with ID, title, description
├── TaskManager.java   # Main class with CRUD logic and menu system

📸 Sample Output
--- Task Manager ---
1. Create Task
2. View Tasks
3. Update Task
4. Delete Task
5. Exit
Choose an option: 1
Enter title: Complete Assignment
Enter description: Finish the CRUD project by Sunday
Task created.

🔮 Possible Future Enhancements
Save tasks to a file (persistence)
Add due dates and completion status
Sort/filter tasks by status or date
Add task priority levels
