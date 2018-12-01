var addRow = '<tr><td><input type="checkbox" name="record"></td><td><select class="form-control" onchange="Other(this.value);" name="AssetName" style="font-size:90%"><option value="CPU">CPU</option><option value="Mouse">Mouse</option><option value="Keyboard">Keyboard</option><option value="Monitor">Monitor</option><option value="Printer">Printer</option><option value="Router">Router</option><option value="Switch">Switch</option><option value="Modem">Modem</option><option value="Server">Server</option><option value="VC Equipment">VC equipment</option><option value="Laptop">Laptop</option></select></td><td><input class="form-control" type="text" style="font-size:75%" name="SerialNo" required></td><td><select class="form-control" onchange="Other1(this.value);" name="MakeType" style="font-size:90%">    <option value="Acer">Acer</option>    <option value="HP">HP</option>    <option value="Dell">Dell</option><option value="Wipro">Wipro</option><option value="Canon">Canon</option></select></td><td><input class="form-control" type="text" style="font-size:75%" name="ModelType" required></td><td><div class="radio"><label><input onclick="returnDate(this.value);" type="radio" name="returnable" value="YES">Yes</label><label><input onclick="returnDate(this.value);" type="radio" name="returnable" value="NO">No</label></div><div class="returnField" style="display: none;"><label>Return Date</label><input type="date" style="font-size:75%;" name="return"></div></td><td><input  class="form-control" type="text" style="font-size:75%" name="IssuedTo" required></td><td><select  class="form-control" onchange="Other1(this.value);" name="Transfer" style="font-size:90%"><option value="IOC">Within IOC</option><option value="HCL">HCL</option><option value="BuyBack">Buy Back</option></select></td><td><textarea class="form-control" name="Issue" style="font-size:75%"></textarea></td></tr>';

$(window).resize(function () {
    footerAlign();
});

$(document).ready(function () {
    footerAlign();
    $(".add-row").click(function () {
        var markup = addRow;
        $("table tbody").append(markup);
    });
    $(".delete-row").click(function(){
        $("table tbody").find('input[name="record"]').each(function(){
            if($(this).is(":checked")){
                $(this).parents("tr").remove();
            }
        });
    });
});

function footerAlign() {
    $('footer').css('display', 'block');
    $('footer').css('height', 'auto');
    var footerHeight = $('footer').outerHeight();
    $('body').css('padding-bottom', footerHeight);
    $('footer').css('height', footerHeight);
}

function returnDate(selectedVal) {
    console.log("man");
    if (selectedVal === 'YES')
    {
        console.log("man1" + selectedVal);
        $('.returnField').show();
    } 
    else {
        $('.returnField').hide();
        $('.returnField').val(null);
    } 
}

function Other1(selectedVal) {
    if (selectedVal === 'Others')
    {
        $('.makeTypeField').show();
    } else {
        $('.makeTypeField').hide();
        $('.makeTypeField').val(null);
    }
}

function populateData(td, uniqueId) {
    //$("#recsplid").val($(td).parent().parent().find('td:eq(0)').text().replace(/\s/g, ""));
    $("#recsplid").val($(td).parent().parent().find('td:eq(0)').text());
    $("#unique").val(uniqueId);
    $("#AssetName").val($(td).parent().parent().find('td:eq(1)').text());
    $("#serialNo").val($(td).parent().parent().find('td:eq(2)').text());
    $("#MakeType").val($(td).parent().parent().find('td:eq(3)').text());
    $("#ModelType").val($(td).parent().parent().find('td:eq(4)').text());
    $("#return").val($(td).parent().parent().find('td:eq(7)').text());
    $("#issue").val($(td).parent().parent().find('td:eq(8)').text());
    $("textarea#issue").val($(td).parent().parent().find('td:eq(8)').text());
    $('#assetId option').each(function () {
        if (this.value === $(td).parent().parent().find('td:eq(1)').text()) {
            $('.assetField').hide();
            $('#assetId option[value=' + this.value + ']').prop('selected', true);
            return false;
        } else {
            $('.assetField').show();
            $('#assetId option:eq(11)').prop('selected', true);
            $('#oth').val($(td).parent().parent().find('td:eq(1)').text());
            return false;
        }
    });
    $('#MakeType  option').each(function () {
        if (this.value === $(td).parent().parent().find('td:eq(3)').text()) {
            $('.makeTypeField').hide();
            $('#MakeType option[value=' + this.value + ']').prop('selected', true);
            return false;
        } else {
            $('.makeTypeField').show();
            $('#MakeType option:eq(5)').prop('selected', true);
            $('#oth1').val($(td).parent().parent().find('td:eq(3)').text());
            return false;
        }
    });
    //console.log($(td).parent().parent().find('td:eq(6)').text());
}