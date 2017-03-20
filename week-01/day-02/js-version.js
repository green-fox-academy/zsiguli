'use strict'
function Factory (id, owner, population, production) {
    this.id = id;
    this.owner = owner;
    this.population = population;
    this.production = production;
    this.sourceScore = owner * population;
    this.targetScore = production + owner - population / 10;
}

var factorys = [];
var target;
var source;
var cyborgs;

var bestSourceScore = 0;
var bestTargetScore = -5;

var factoryCount = parseInt(readline()); // the number of factories
var linkCount = parseInt(readline()); // the number of links between factories
for (var i = 0; i < linkCount; i++) {
    var inputs = readline().split(' ');
    var factory1 = parseInt(inputs[0]);
    var factory2 = parseInt(inputs[1]);
    var distance = parseInt(inputs[2]);
}

// game loop
while (true) {
    var entityCount = parseInt(readline()); // the number of entities (e.g. factories and troops)
    for (var i = 0; i < entityCount; i++) {
        var inputs = readline().split(' ');
        var entityId = parseInt(inputs[0]);
        var entityType = inputs[1];
        var arg1 = parseInt(inputs[2]);
        var arg2 = parseInt(inputs[3]);
        var arg3 = parseInt(inputs[4]);
        var arg4 = parseInt(inputs[5]);
        var arg5 = parseInt(inputs[6]);

        if (entityType === 'FACTORY') {
            factorys.push(new Factory(entityId, arg1, arg2, arg3));
        }

    }

    for (var i = 0; i < factorys.length; i++) {

            if (factorys[i].sourceScore > bestSourceScore) {
              bestSourceScore = factorys[i].sourceScore;
              source = factorys[i].id;
              continue;
            }

            if (factorys[i].targetScore > bestTargetScore) {
              bestTargetScore = factorys[i].targetScore;
              target = factorys[i].id;
              cyborgs = Math.floor(factorys[i].population + factorys[i].production * 10 );
            }


    }
   if (source === undefined || target === undefined || source === target) {
       print('WAIT')
   } else {
       print('MOVE ' + source +' '+ target +' '+ cyborgs);
   }


   factorys = [];
   bestSourceScore = 0;
   bestTargetScore = 0;
}
