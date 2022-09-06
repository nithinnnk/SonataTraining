const path= require('path');
console.log(__filename);
console.log(path.basename(__filename));
console.log(path.dirname(__filename));
console.log(path.extname(__filename));
//concatinate paths
console.log(path.join(__dirname,'test','hello.html'));




