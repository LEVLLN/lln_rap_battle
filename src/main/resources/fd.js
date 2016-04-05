var test = function () {
    var res = {};
    res.categories = new Array();
    var count = 0;
    $('ul.sub-1').children().each(function (index_sub1, item_sub1) {
        var category = {};

        count += 1;
        category.id = count;
        category.name = item_sub1.innerText.trim()
        category.children = new Array();
        var arr = new Array();
        var i;
        var k = $('ul.sub-2 div.table')[index_sub1]
        console.log(k)

        for (i = 0; i < k.children.length; i++) {
            var objRaz = {};
            count += 1
             var splited =  k.children[i].children[0].innerText.split(':')
            objRaz.name = splited[0]
            objRaz.id = count;
            objRaz.children = new Array();
            console.log("[" + k.children[i].children[0].innerText + "]")
            var ji;

            for (ji = 1; ji < k.children[i].children.length; ji++) {

                var objChi = {};
                count += 1;
                objChi.id = count;
                objChi.name = k.children[i].children[ji].innerText.trim();


                objRaz.children[ji] = objChi;
                console.log(k.children[i].children[ji].innerText)
            }
            objRaz.children.splice(0,1)
            category.children[i] = objRaz;
            // category.children[index_sub1]
        }

        // var k = $('ul.sub-2 div.table')[0]
        // console.log(k.children[index_sub1].innerText)
        res.categories[index_sub1] = category
    });

// $('ul.sub-2 div.table').each(function(i,it){
// 			console.log(it)
// 		})[0];


    console.log(JSON.stringify(res))

}
test();
