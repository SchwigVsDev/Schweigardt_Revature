let t = setInterval(() => {
    var dayNum = new Date().getDay();
    var dayStr = ""
    switch (dayNum) {
        case 0:
            dayStr = "Sunday"; break;
        case 1:
            dayStr = "Monday"; break;
        case 2:
            dayStr = "Tuesday"; break;
        case 3:
            dayStr = "Wednesday"; break;
        case 4:
            dayStr = "Thursday"; break;
        case 5:
            dayStr = "Friday"; break;
        case 6:
            dayStr = "Saturday"; break;
        default:
            break;
    }
    document.getElementById("Clock").innerHTML =
        dayStr + " | " + (new Date().getMonth() + 1) + "/" + new Date().getDate() + "/" + new Date().getFullYear() + " | " + new Date().getHours() + ':' + new Date().getMinutes() + ':' + new Date().getSeconds();
}, 1000);

document.getElementById("Button").onclick = () => {
    document.getElementById("Write").innerHTML = document.getElementById("Text").value;
};

document.getElementById("Button2").onclick = () => {
    var img = document.createElement("img");
    img.id = "JSImage";
    img.src =
        "https://news.nationalgeographic.com/content/dam/news/2018/05/17/you-can-train-your-cat/02-cat-training-NationalGeographic_1484324.jpg";

    document.body.appendChild(img);
};

var p = document.createElement("div");
p.id = "JSParagraph";
p.innerHTML = "This Paragraph was added through CSS.";
document.body.appendChild(p);

document.getElementById("Content").parentNode.insertBefore(
    p,
    document.getElementById("Content").nextSibling
);


