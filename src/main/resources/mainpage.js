var test = function () {
    var res = {}
    res.title = $('a.title')[0].text
    res.href = $('a.title')[0].href

    res.items = new Array();

    //$('.table_m').each(function(i, it) {
    //    $(it).find('.good').each(function (jIndex, jIt){
    //        console.log(jIt)
    //        //var tmp = {};
    //        //tmp.img = $(it).find('img').attr('src');
    //        //tmp.title = $(it).find('.title span').text();
    //        //tmp.price = $(it).find('.new_price').text();
    //        //res.items[i] = tmp
    //    });
    //});
    for(var i=0;i< $('.table_m')[0].children.length;i++){

        console.log($('.table_m')[0].children[i].find('.good'))
    }

        //console.log($('div.table_m')[0].children.length)
        //$('div.table_m')[0].children.each(function(index,item){
        //    console.log(index)
        //})

        //var i;
        //var table = $('div.table_m')[0].children
        //for (i = 0; i < table.length; i++) {
        //    content = table[i].children[i].children
        //    $('div.table_m[0]')
        //    console.log(content.children.length)
        //}

    console.log(JSON.stringify(res))
}

test();