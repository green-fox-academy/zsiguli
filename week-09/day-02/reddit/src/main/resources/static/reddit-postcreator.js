var postCreator = function(dataFromServer){
    articleContainer.innerHTML = '';
    classNumber = 0;
    dataFromServer.forEach(function(element){
        classNumber++;
        var id = element.id;

        var article = document.createElement('article');
        article.setAttribute('class', 'article');
        articleContainer.appendChild(article);

        var rank = document.createElement('div');
        rank.setAttribute('class', 'rank');
        rank.innerHTML = classNumber;
        article.appendChild(rank);

        var upArrow = document.createElement('img');
        upArrow.setAttribute('src', 'upvote.png');
        upArrow.setAttribute('class', 'upvote');
        article.appendChild(upArrow);

        var voteNumber = document.createElement('div');
        voteNumber.setAttribute('class', 'vote')
        voteNumber.innerHTML = element.score;
        article.appendChild(voteNumber);

        var downArrow = document.createElement('img');
        downArrow.setAttribute('src', 'downvote.png');
        downArrow.setAttribute('class', 'downvote');
        article.appendChild(downArrow);

        var title = document.createElement('a');
        title.setAttribute('href', element.href);
        title.innerHTML = element.title;
        article.appendChild(title);

        var articleInfo = document.createElement('div');
        articleInfo.setAttribute('class', 'info');
        articleInfo.innerHTML = 'submitted' + ' ' + timeago().format(element.timestamp) + ' ' + 'by' + ' ' + element.owner;
        article.appendChild(articleInfo);

        var modify = document.createElement('button');
        modify.setAttribute('class', 'modify');
        modify.innerHTML = 'modify';
        article.appendChild(modify);

        var remove = document.createElement('button');
        remove.setAttribute('class', 'remove');
        remove.innerHTML = 'remove';
        article.appendChild(remove);

        upArrow.addEventListener('click', function(){
            upVote(element.id, upArrow);
        });

        downArrow.addEventListener('click', function(){
            downVote(element.id, downArrow);
        });

        remove.addEventListener('click', function(){
            deleteRemove(element.id);
        });
    });
}
