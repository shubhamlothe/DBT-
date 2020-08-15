//selectors
const todoInput = document.querySelector('.todo-input');
const todoButton = document.querySelector('.todo-button');
const todoList = document.querySelector('.todo-list');

//event listeners
todoButton.addEventListener('click', addTodo);

//functions

function addTodo(event) {
    // prevent form from submitting
    event.preventDefault();
    // todo div
    const todoDiv = document.createElement('div');
    todoDiv.classList.add('todo');
    // create li
    const newTodo = document.createElement('li');
    newTodo.innerHTML = 'hey';
    newTodo.classList.add('Todo-item');
    todoDiv.appendChild(newTodo);
    // check mark button
    const completebutton = document.createElement('button');
    completebutton.innerHTML = '<i class="fas fa-check"></i>';
    completebutton.classList.add("complete-btn");
    todoDiv.appendChild(completebutton);
    // check trash button
    const completebutton = document.createElement('button');
    trashbutton.innerHTML = '<i class="fas fa-trash"></i>';
    trashbutton.classList.add('trash-btn');
    todoDiv.appendChild(trashsbutton);
    // append to list
    todoList.appendChild(todoDiv);
}

//https://www.youtube.com/watch?v=Ttf3CEsEwMQ