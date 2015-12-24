
$(function(){
	var playList = ["09.mp3","08.mp3","07.mp3"],
	$list = $('<ul/>'),
	audioList = {}, fileName="",
	currentSong = "", $currentSong =$('#current_song'),
	$pause = $('#pause');
	
	for(var i =0, len = playList.length; i <len; i++){
		fileName = playList[i];
		audioList[fileName] = new Audio(fileName);
		$list.append($('<li/>',{
			text: fileName,
			click: songClickEvent
		}
		));
	}
	
	$('#play_list').html($list);
	
	function songClickEvent(e){
		var selectedSong =$(e.target).text();
		$pause.click();
		audioList[selectedSong].play();
		currentSong = selectedSong;
		$currentSong.text(selectedSong);
	}
	
	$pause.click(function(){
		audioList[currentSong]&&audioList[currentSong].pause();
	});
});