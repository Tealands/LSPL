//JSX
{
function Video({ video }) {//動画用のコンポーネント
  return (
    <div>
      <Thumbnail video={video} />
      <a href={video.url}>
        <h3>{video.title}</h3>
        <p>{video.description}</p>
      </a>
      <LikeButton video={video} />//♡ボタン
    </div>
  );
}
------------------------------------------------------
useEffectはReactのフックの一つで、副作用を管理するために使用されます。以下は、useEffectの基本的な使い方と例です。
useEffect(() => {//コンポーネントがマウントされたときに動画データを取得
  fetchVideoData().then(data => setVideo(data));
}, []);
useEffect(() => {//videoが更新されたときにコンソールにログを出力
  console.log("Video updated:", video);
}, [video]);
------------------------------------------------------
useStateはReactのフックの一つで、関数コンポーネント内で状態を管理するために使用されます。以下は、useStateの基本的な使い方と例です。
import React, { useState } from 'react';
useState(null);//動画データを格納する状態変数
useState(0);//
------------------------------------------------------
const [video, setVideo] = useState(null);//動画データの状態管理
if (!video) {
  return <div>Loading...</div>;//動画データがまだない場合のローディング表示
}
------------------------------------------------------
fanction App() {//html全体のコンポーネントs
  return (
    <div>
      <h1>Video Gallery</h1>
      <VideoList /> {/*ここでのコメントアウトは通常のhtmlと異なり、このように書く*/}
    </div>
  );
}
------------------------------------------------------
inputValue === "A"//===は厳密な等価性を比較する演算子である。==でもいいがあまりよくない。
------------------------------------------------------
type GoodInfo = {//構造体の使いかた
  id: number;
  name: string;
  price: number;
};
------------------------------------------------------
//インスタンスの使いかた
student.id//構造体studentの中のidを参照する

student{
  id:11
  name:Stalin
  level:99
}//ならば
student.id==11
------------------------------------------------------





}