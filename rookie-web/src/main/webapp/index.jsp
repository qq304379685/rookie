<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>iview example</title>
    <link rel="stylesheet" type="text/css" href="/css/iview.css">
    <script type="text/javascript" src="/js/vue.min.js"></script>
    <script type="text/javascript" src="/js/iview.min.js"></script>
</head>
<body>
<div id="app-5">
    <ol>
        <todo-item></todo-item>
    </ol>
</div>
<script>
    Vue.component('todo-item', {
        template: '<li>This is a todo111</li>'
    })
    new Vue({
        el: '#app-5'
    });
</script>
</body>
</html>