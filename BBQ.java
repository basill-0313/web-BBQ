// bbq_spot_finder_script.js

document.addEventListener('DOMContentLoaded', function() {

    const bbqData = [
        {
            id: 'umi_no_koen',
            name: '海の公園バーベキュー場',
            location: '横浜市金沢区',
            waterType: '海',
            price: 1500,
            time: 50,
            tags: ['低予算', '潮干狩り', 'ビーチバレー'],
            summary: '手頃な価格で海辺のBBQを満喫！潮干狩りやビーチバレーなどアクティビティも充実しており、予算を抑えたい学生に最適。',
            details: {
                description: `海の公園は広大な砂浜に隣接し、BBQと海辺のアクティビティを存分に楽しめます。サイト利用料が団体2時間2,600円と非常に手頃で、予算を重視する大学生グループに大きな利点です。`,
                plan: `明確な「手ぶらプラン」はありませんが、磯浜売店でコンロレンタルや食材、用品の販売があり、手ぶらをサポート。サイトに炉はないためコンロのレンタルか持参が必要です。食材を持ち込むことでさらに費用を抑えられます。`,
                activities: `広々とした砂浜での海水浴や、無料のビーチバレーコート、潮干狩りシーズンには潮干狩りも楽しめます。`,
                access: `武蔵新城駅から車で約40分?60分。公園駐車場（有料:1時間310円、最大1,550円）を利用。繁忙期は駐車場・周辺道路が大変混雑するため、早めの到着がおすすめです。`,
                advice: `人気スポットなので、特に繁忙期は事前予約と早めの行動が鍵。費用を抑えたいなら食材持ち込みがベスト。一日中飽きずに過ごせます。`
            }
        },
        {
            id: 'kasai_rinkai',
            name: '葛西臨海公園バーベキュー広場',
            location: '東京都江戸川区',
            waterType: '海',
            price: 3800,
            time: 55,
            tags: ['完全手ぶら', 'アクセス良好', '周辺施設充実'],
            summary: '準備・片付け不要の完全手ぶらプランが魅力。観覧車や水族園も近く、BBQ以外の楽しみも満載。',
            details: {
                description: `都内からのアクセスも良く、手軽にBBQを楽しみたいグループにぴったり。BBQ会場から直接海は見えませんが、すぐ近くの海浜公園で水遊びが可能です。`,
                plan: `食材、機材、片付けまで全て込みの「手ぶらプラン」が1人3,800円から。ドリンクは持ち込み自由なので、予算を抑えやすいのが嬉しいポイント。`,
                activities: `近くの海浜公園で水遊びができるほか、公園内には「ダイヤと花の大観覧車」や「葛西臨海水族園」といった人気スポットがあり、一日中楽しめます。`,
                access: `武蔵新城駅から車で約45分?70分。公園駐車場（有料）からBBQエリアまでは徒歩約5分。BBQ利用による駐車割引はありません。`,
                advice: `幹事さんの負担を最小限にしたいグループに最適。飲み物を持ち寄って、BBQの後は公園内のアトラクションを満喫するのがおすすめです。週末は混雑するため予約は必須。`
            }
        },
        {
            id: 'showa_kinen',
            name: '国営昭和記念公園バーベキューガーデン',
            location: '東京都立川市',
            waterType: '川',
            price: 4000,
            time: 65,
            tags: ['広大な自然', '川遊び', '夏季プール'],
            summary: '広大な公園の自然の中でBBQ！川遊びや夏季限定のプールも楽しめ、開放感を求めるグループに最適。',
            details: {
                description: `都会の喧騒を離れてリフレッシュしたい学生グループにぴったりの場所。広々とした自然豊かな環境でBBQが楽しめます。`,
                plan: `手ぶらプランあり。口コミでは「持ち込みもOK」との声もあり、予算や好みに合わせて柔軟に計画できる可能性があります。「学生プラン」のがあるかもしれないので、要チェック。`,
                activities: `BBQガーデン近くを流れる川で水遊びができます。夏季には園内のプールも利用可能。広大な公園なのでサイクリングや散策も楽しめます。`,
                access: `武蔵新城駅から車で約50分?80分。西立川ゲート駐車場（有料:1日900円）が最寄りで便利です。`,
                advice: `開放感抜群で大人数でも快適。手ぶらと持ち込みのバランスを考えて計画を立てられるのが魅力。BBQ以外のアクティビティも豊富で一日中楽しめます。`
            }
        },
        {
            id: 'sarushima',
            name: '猿島BBQ',
            location: '神奈川県横須賀市',
            waterType: '海',
            price: 4000,
            time: 75,
            tags: ['無人島', '非日常体験', 'SNS映え'],
            summary: '東京湾唯一の無人島でBBQ！冒険心あふれる非日常体験は、忘れられない思い出になること間違いなし。',
            details: {
                description: `「無人島」という特別なロケーションが最大の魅力。歴史的な史跡散策や本格的な磯遊びなど、都会では味わえない体験が待っています。`,
                plan: `機材レンタルで手ぶらBBQが可能。食材は持ち込みか、デリバリーサービスを利用。BBQ料金の他に、船代と入園料が別途必要なので、総予算の計画が重要。`,
                activities: `磯遊び、釣り、海水浴など本格的な海辺のアクティビティが可能。歴史的な要塞跡を散策するのも楽しい。`,
                access: `武蔵新城駅から三笠桟橋まで車で約60分?90分。そこから船で約10分。三笠桟橋周辺に有料駐車場が複数あります。船は予約不可なので早めの行動を。`,
                advice: `SNS映えは抜群！特別な思い出作りに最適です。食材や飲み物を持ち込んで費用を抑えるのが賢い選択。フェリーの時間を事前に確認し、余裕を持ったスケジュールを組みましょう。`
            }
        },
        {
            id: 'soleil_hill',
            name: '長井海の手公園 ソレイユの丘',
            location: '神奈川県横須賀市',
            waterType: '海',
            price: 2500,
            time: 85,
            tags: ['高コスパ', 'じゃぶじゃぶ池', 'アトラクション豊富'],
            summary: 'リーズナブルな手ぶらBBQに加え、じゃぶじゃぶ池やジップラインなど、多様なアトラクションで一日中遊び尽くせる。',
            details: {
                description: `BBQだけでなく、様々なアクティビティを楽しみたいアクティブな学生グループにおすすめの複合施設です。`,
                plan: `1人2,500円からと非常にリーズナブルな手ぶらBBQプランを提供。火起こしから道具まで全て揃っています。ただし、口コミでは食材の量が少なめとの声もあるため、追加食材の持ち込み検討もアリ。`,
                activities: `園内には気軽に水遊びできる「じゃぶじゃぶ池」があり、夏の暑い日にぴったり。ジップライン、動物とのふれあい、芝そり、季節の花畑など、アトラクションが満載。`,
                access: `武蔵新城駅から車で約70分?100分。有料駐車場（普通車 平日1,050円、土日祝1,200円）完備。`,
                advice: `アクティブなグループに最適なスポット。BBQとじゃぶじゃぶ池の組み合わせは夏に最高。食材の量に不安があれば、軽食などを持参するとより満足度が上がります。`
            }
        },
        {
            id: 'honmoku_pool',
            name: '本牧市民プール BBQPIT横浜＆CAMP',
            location: '横浜市中区',
            waterType: 'プール',
            price: 5030,
            time: 40,
            tags: ['プール直結', '2023年リニューアル', '夏に最適'],
            summary: 'プールとBBQを同時に楽しめる！リニューアルしたての綺麗な施設で、夏の思い出作りに最高のロケーション。',
            details: {
                description: `特に夏季の大学生グループに理想的な選択肢。プールサイドに隣接したBBQエリアは利便性が高く、水着のまま行き来できます。`,
                plan: `手ぶらプランは1人3,630円から。日よけテントも常設で快適です。ただし、プール利用には別途入場料（大人1,400円）が必要なので総費用に含めて計算を。`,
                activities: `流れるプールやエアーアトラクションプールなど、大人も楽しめるプールが充実。BBQの合間にクールダウンするのに最適です。`,
                access: `武蔵新城駅から車で約30分?50分とアクセス抜群。165台収容の有料駐車場（プール利用者限定1日1,000円）が完備されています。`,
                advice: `夏にBBQとプールを両方楽しみたいならここ一択！人気施設なので、特に夏休み期間は早めの予約と到着を心がけ、待ち時間を賢く回避しましょう。`
            }
        },
        {
            id: 'juurigiland',
            name: '十里木ランド',
            location: '東京都あきる野市 (秋川渓谷)',
            waterType: '川',
            price: 2500, // Estimated: 7000 yen for 7 people + car parking 1200 / 7 = ~1000 + some food cost
            time: 80, // Estimated 60-90 minutes from Musashi-Shinjo
            tags: ['清流', '川遊び', '手ぶら対応', '釣り'],
            summary: '清流秋川渓谷の大自然の中でBBQと川遊びを満喫！手ぶらプランや機材レンタルも充実しており、気軽にアウトドアを楽しめます。',
            details: {
                description: `清流秋川渓谷に位置し、大自然の中でBBQや川遊び、釣りなどを楽しめるスポットです。屋根付きのBBQ場もあり、天候を気にせず利用できます。`,
                plan: `食材セットの用意からBBQに必要な用具のレンタルまで対応しており、手ぶらでBBQを楽しめます。7人までの屋根付き区画は7,000円で利用可能です。`,
                activities: `清流での川遊びはもちろん、釣り堀での釣りも楽しめます。大自然の中でリフレッシュしたいグループに最適です。`,
                access: `武蔵新城駅から車で約60分?90分。普通車1台1,200円の駐車場があります。`,
                advice: `自然を満喫したい学生グループに最適。手ぶらプランを活用しつつ、川遊びや釣りで一日中アクティブに過ごせます。人気の場所なので、特にシーズン中は早めの予約がおすすめです。`
            }
        }
    ];

    const cardGrid = document.getElementById('card-grid');
    // Removed noResults element and its handling as there's no filtering

    const modal = document.getElementById('modal');
    const modalContent = document.getElementById('modal-content');
    const modalClose = document.getElementById('modal-close');
    const modalTitle = document.getElementById('modal-title');
    const modalBody = document.getElementById('modal-body');
    // Removed AI assistant related elements and their references

    let currentSpotDetails = null; // To store details of the currently open spot

    function formatPrice(value) {
        return `\${parseInt(value).toLocaleString()}`;
    }
    
    function formatTime(value) {
        return `${value}分以内`;
    }

    function renderCards(data) {
        cardGrid.innerHTML = '';
        // Removed no-results check as all data is displayed
        data.forEach(spot => {
            const card = document.createElement('div');
            card.className = 'bg-white rounded-2xl shadow-lg overflow-hidden transform hover:scale-105 hover:shadow-2xl transition-all duration-300 cursor-pointer flex flex-col';
            card.dataset.id = spot.id;
            card.innerHTML = `
                <div class="p-6 flex-grow">
                    <div class="flex justify-between items-start mb-2">
                        <h3 class="text-xl font-bold text-gray-800">${spot.name}</h3>
                        <div class="text-3xl">${spot.waterType === '海' ? '?' : spot.waterType === '川' ? '??' : '?'}</div>
                    </div>
                    <p class="text-sm text-gray-500 mb-4">${spot.location}</p>
                    <p class="text-gray-600 mb-4 text-sm flex-grow">${spot.summary}</p>
                    <div class="flex items-center justify-between text-sm mt-4">
                       <div class="font-bold text-lg text-teal-600">${formatPrice(spot.price)}<span class="text-xs font-normal text-gray-500">/人~</span></div>
                        <div class="text-gray-600 font-medium">? ${spot.time}分</div>
                    </div>
                </div>
                <div class="bg-gray-50 px-6 py-3">
                    <div class="flex flex-wrap gap-2">
                        ${spot.tags.map(tag => `<span class="tag bg-gray-200 text-gray-700">${tag}</span>`).join('')}
                    </div>
                </div>
            `;
            cardGrid.appendChild(card);
        });
    }

    function showModal(spotId) {
        const spot = bbqData.find(s => s.id === spotId);
        if (!spot) return;

        currentSpotDetails = spot; // Store current spot details
        modalTitle.textContent = spot.name;

        modalBody.innerHTML = `
            <div class="grid grid-cols-1 lg:grid-cols-2 gap-8">
                <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? どんな場所？</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.description}</p>
                </div>
                 <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? 手ぶらプラン詳細</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.plan}</p>
                </div>
                <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? アクティビティ</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.activities}</p>
                </div>
                 <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? アクセス＆駐車場</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.access}</p>
                </div>
                 <div class="lg:col-span-2">
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? 大学生向けアドバイス</h4>
                    <p class="text-gray-700 leading-relaxed bg-amber-50 p-4 rounded-lg">${spot.details.advice}</p>
                </div>
            </div>
        `;
        
        modal.classList.remove('invisible', 'opacity-0');
        modalContent.classList.remove('scale-95');
        modalContent.classList.add('scale-100');
    }

    function hideModal() {
        modal.classList.add('opacity-0');
        modalContent.classList.remove('scale-100');
        modalContent.classList.add('scale-95');
        setTimeout(() => {
            modal.classList.add('invisible');
        }, 300);
    }

    renderCards(bbqData); // Render all data initially

    cardGrid.addEventListener('click', function(e) {
        const card = e.target.closest('[data-id]');
        if (card) {
            showModal(card.dataset.id);
        }
    });

    modalClose.addEventListener('click', hideModal);
    modal.addEventListener('click', (e) => {
        if (e.target === modal) {
            hideModal();
        }
    });
});
