/**
 * Created by user on 11.03.2016.
 */
var test = function() {
    var res = {}
    res.title = $('a.title')[6].text
    res.href = $('a.title')[6].href

    res.items = new Array();

    $('.table_m').eq(6).each(function(i, it) {
        $(it).find('.good').each(function(i, it) {
            var tmp = {};
            tmp.image = $(it).find('img').attr('src');
            tmp.title = $(it).find('.title span').text();
            tmp.href = $(it).find('.title a').attr('href');
            tmp.id = parseInt(tmp.href.split('prod=')[1]);
            tmp.price = $(it).find('.new_price').text();
            tmp.price = tmp.price.replace(' ', '');
            tmp.price = tmp.price.replace('тг.', '');
            tmp.price = parseInt(tmp.price);
            tmp.stock = $(it).find('.ndelivery span').text();
            tmp.subtitle = '';
            $(it).find('.title .small').each(function(i, it) { tmp.subtitle += it.innerText + '\n' });
            tmp.subtitle = tmp.subtitle.trim();
            res.items[i] = tmp
        });
        //console.log('====');
    });
    console.log(JSON.stringify(res))
};

test();