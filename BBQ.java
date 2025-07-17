// bbq_spot_finder_script.js

document.addEventListener('DOMContentLoaded', function() {

    const bbqData = [
        {
            id: 'umi_no_koen',
            name: '�C�̌����o�[�x�L���[��',
            location: '���l�s�����',
            waterType: '�C',
            price: 1500,
            time: 50,
            tags: ['��\�Z', '�������', '�r�[�`�o���['],
            summary: '�荠�ȉ��i�ŊC�ӂ�BBQ�𖞋i�I��������r�[�`�o���[�ȂǃA�N�e�B�r�e�B���[�����Ă���A�\�Z��}�������w���ɍœK�B',
            details: {
                description: `�C�̌����͍L��ȍ��l�ɗאڂ��ABBQ�ƊC�ӂ̃A�N�e�B�r�e�B�𑶕��Ɋy���߂܂��B�T�C�g���p�����c��2����2,600�~�Ɣ��Ɏ荠�ŁA�\�Z���d�������w���O���[�v�ɑ傫�ȗ��_�ł��B`,
                plan: `���m�ȁu��Ԃ�v�����v�͂���܂��񂪁A��l���X�ŃR���������^����H�ށA�p�i�̔̔�������A��Ԃ���T�|�[�g�B�T�C�g�ɘF�͂Ȃ����߃R�����̃����^�������Q���K�v�ł��B�H�ނ��������ނ��Ƃł���ɔ�p��}�����܂��B`,
                activities: `�L�X�Ƃ������l�ł̊C������A�����̃r�[�`�o���[�R�[�g�A�������V�[�Y���ɂ͒��������y���߂܂��B`,
                access: `�����V��w����ԂŖ�40��?60���B�������ԏ�i�L��:1����310�~�A�ő�1,550�~�j�𗘗p�B�ɖZ���͒��ԏ�E���ӓ��H����ύ��G���邽�߁A���߂̓������������߂ł��B`,
                advice: `�l�C�X�|�b�g�Ȃ̂ŁA���ɔɖZ���͎��O�\��Ƒ��߂̍s�������B��p��}�������Ȃ�H�ގ������݂��x�X�g�B������O�����ɉ߂����܂��B`
            }
        },
        {
            id: 'kasai_rinkai',
            name: '�����ՊC�����o�[�x�L���[�L��',
            location: '�����s�]�ː��',
            waterType: '�C',
            price: 3800,
            time: 55,
            tags: ['���S��Ԃ�', '�A�N�Z�X�ǍD', '���ӎ{�ݏ[��'],
            summary: '�����E�Еt���s�v�̊��S��Ԃ�v���������́B�ϗ��Ԃ␅�������߂��ABBQ�ȊO�̊y���݂����ځB',
            details: {
                description: `�s������̃A�N�Z�X���ǂ��A��y��BBQ���y���݂����O���[�v�ɂ҂�����BBBQ��ꂩ�璼�ڊC�͌����܂��񂪁A�����߂��̊C�l�����Ő��V�т��\�ł��B`,
                plan: `�H�ށA�@�ށA�Еt���܂őS�č��݂́u��Ԃ�v�����v��1�l3,800�~����B�h�����N�͎������ݎ��R�Ȃ̂ŁA�\�Z��}���₷���̂��������|�C���g�B`,
                activities: `�߂��̊C�l�����Ő��V�т��ł���ق��A�������ɂ́u�_�C���ƉԂ̑�ϗ��ԁv��u�����ՊC�������v�Ƃ������l�C�X�|�b�g������A������y���߂܂��B`,
                access: `�����V��w����ԂŖ�45��?70���B�������ԏ�i�L���j����BBQ�G���A�܂ł͓k����5���BBBQ���p�ɂ�钓�Ԋ����͂���܂���B`,
                advice: `��������̕��S���ŏ����ɂ������O���[�v�ɍœK�B���ݕ�����������āABBQ�̌�͌������̃A�g���N�V�����𖞋i����̂��������߂ł��B�T���͍��G���邽�ߗ\��͕K�{�B`
            }
        },
        {
            id: 'showa_kinen',
            name: '���c���a�L�O�����o�[�x�L���[�K�[�f��',
            location: '�����s����s',
            waterType: '��',
            price: 4000,
            time: 65,
            tags: ['�L��Ȏ��R', '��V��', '�ċG�v�[��'],
            summary: '�L��Ȍ����̎��R�̒���BBQ�I��V�т�ċG����̃v�[�����y���߁A�J���������߂�O���[�v�ɍœK�B',
            details: {
                description: `�s��̌����𗣂�ă��t���b�V���������w���O���[�v�ɂ҂�����̏ꏊ�B�L�X�Ƃ������R�L���Ȋ���BBQ���y���߂܂��B`,
                plan: `��Ԃ�v��������B���R�~�ł́u�������݂�OK�v�Ƃ̐�������A�\�Z��D�݂ɍ��킹�ď_��Ɍv��ł���\��������܂��B�u�w���v�����v�̂����邩������Ȃ��̂ŁA�v�`�F�b�N�B`,
                activities: `BBQ�K�[�f���߂��𗬂���Ő��V�т��ł��܂��B�ċG�ɂ͉����̃v�[�������p�\�B�L��Ȍ����Ȃ̂ŃT�C�N�����O��U����y���߂܂��B`,
                access: `�����V��w����ԂŖ�50��?80���B������Q�[�g���ԏ�i�L��:1��900�~�j���Ŋ��ŕ֗��ł��B`,
                advice: `�J�������Q�ő�l���ł����K�B��Ԃ�Ǝ������݂̃o�����X���l���Čv��𗧂Ă���̂����́BBBQ�ȊO�̃A�N�e�B�r�e�B���L�x�ň�����y���߂܂��B`
            }
        },
        {
            id: 'sarushima',
            name: '����BBQ',
            location: '�_�ސ쌧���{��s',
            waterType: '�C',
            price: 4000,
            time: 75,
            tags: ['���l��', '�����̌�', 'SNS�f��'],
            summary: '�����p�B��̖��l����BBQ�I�`���S���ӂ������̌��́A�Y����Ȃ��v���o�ɂȂ邱�ƊԈႢ�Ȃ��B',
            details: {
                description: `�u���l���v�Ƃ������ʂȃ��P�[�V�������ő�̖��́B���j�I�Ȏj�ՎU���{�i�I�Ȉ�V�тȂǁA�s��ł͖��킦�Ȃ��̌����҂��Ă��܂��B`,
                plan: `�@�ރ����^���Ŏ�Ԃ�BBQ���\�B�H�ނ͎������݂��A�f���o���[�T�[�r�X�𗘗p�BBBQ�����̑��ɁA�D��Ɠ��������ʓr�K�v�Ȃ̂ŁA���\�Z�̌v�悪�d�v�B`,
                activities: `��V�сA�ނ�A�C�����Ȃǖ{�i�I�ȊC�ӂ̃A�N�e�B�r�e�B���\�B���j�I�ȗv�ǐՂ��U�􂷂�̂��y�����B`,
                access: `�����V��w����O�}�V���܂ŎԂŖ�60��?90���B��������D�Ŗ�10���B�O�}�V�����ӂɗL�����ԏꂪ��������܂��B�D�͗\��s�Ȃ̂ő��߂̍s�����B`,
                advice: `SNS�f���͔��Q�I���ʂȎv���o���ɍœK�ł��B�H�ނ���ݕ�����������Ŕ�p��}����̂������I���B�t�F���[�̎��Ԃ����O�Ɋm�F���A�]�T���������X�P�W���[����g�݂܂��傤�B`
            }
        },
        {
            id: 'soleil_hill',
            name: '����C�̎���� �\���C���̋u',
            location: '�_�ސ쌧���{��s',
            waterType: '�C',
            price: 2500,
            time: 85,
            tags: ['���R�X�p', '����Ԃ���Ԓr', '�A�g���N�V�����L�x'],
            summary: '���[�Y�i�u���Ȏ�Ԃ�BBQ�ɉ����A����Ԃ���Ԓr��W�b�v���C���ȂǁA���l�ȃA�g���N�V�����ň�����V�ѐs������B',
            details: {
                description: `BBQ�����łȂ��A�l�X�ȃA�N�e�B�r�e�B���y���݂����A�N�e�B�u�Ȋw���O���[�v�ɂ������߂̕����{�݂ł��B`,
                plan: `1�l2,500�~����Ɣ��Ƀ��[�Y�i�u���Ȏ�Ԃ�BBQ�v������񋟁B�΋N�������瓹��܂őS�đ����Ă��܂��B�������A���R�~�ł͐H�ނ̗ʂ����Ȃ߂Ƃ̐������邽�߁A�ǉ��H�ނ̎������݌������A���B`,
                activities: `�����ɂ͋C�y�ɐ��V�тł���u����Ԃ���Ԓr�v������A�Ă̏������ɂ҂�����B�W�b�v���C���A�����Ƃ̂ӂꂠ���A�ł���A�G�߂̉Ԕ��ȂǁA�A�g���N�V���������ځB`,
                access: `�����V��w����ԂŖ�70��?100���B�L�����ԏ�i���ʎ� ����1,050�~�A�y���j1,200�~�j�����B`,
                advice: `�A�N�e�B�u�ȃO���[�v�ɍœK�ȃX�|�b�g�BBBQ�Ƃ���Ԃ���Ԓr�̑g�ݍ��킹�͉Ăɍō��B�H�ނ̗ʂɕs��������΁A�y�H�Ȃǂ����Q����Ƃ�薞���x���オ��܂��B`
            }
        },
        {
            id: 'honmoku_pool',
            name: '�{�q�s���v�[�� BBQPIT���l��CAMP',
            location: '���l�s����',
            waterType: '�v�[��',
            price: 5030,
            time: 40,
            tags: ['�v�[������', '2023�N���j���[�A��', '�ĂɍœK'],
            summary: '�v�[����BBQ�𓯎��Ɋy���߂�I���j���[�A�������Ă��Y��Ȏ{�݂ŁA�Ă̎v���o���ɍō��̃��P�[�V�����B',
            details: {
                description: `���ɉċG�̑�w���O���[�v�ɗ��z�I�ȑI�����B�v�[���T�C�h�ɗאڂ���BBQ�G���A�͗��֐��������A�����̂܂܍s�����ł��܂��B`,
                plan: `��Ԃ�v������1�l3,630�~����B���悯�e���g����݂ŉ��K�ł��B�������A�v�[�����p�ɂ͕ʓr���ꗿ�i��l1,400�~�j���K�v�Ȃ̂ő���p�Ɋ܂߂Čv�Z���B`,
                activities: `�����v�[����G�A�[�A�g���N�V�����v�[���ȂǁA��l���y���߂�v�[�����[���BBBQ�̍��ԂɃN�[���_�E������̂ɍœK�ł��B`,
                access: `�����V��w����ԂŖ�30��?50���ƃA�N�Z�X���Q�B165����e�̗L�����ԏ�i�v�[�����p�Ҍ���1��1,000�~�j����������Ă��܂��B`,
                advice: `�Ă�BBQ�ƃv�[���𗼕��y���݂����Ȃ炱������I�l�C�{�݂Ȃ̂ŁA���ɉċx�݊��Ԃ͑��߂̗\��Ɠ�����S�����A�҂����Ԃ�����������܂��傤�B`
            }
        },
        {
            id: 'juurigiland',
            name: '�\���؃����h',
            location: '�����s�������s (�H��k�J)',
            waterType: '��',
            price: 2500, // Estimated: 7000 yen for 7 people + car parking 1200 / 7 = ~1000 + some food cost
            time: 80, // Estimated 60-90 minutes from Musashi-Shinjo
            tags: ['����', '��V��', '��Ԃ�Ή�', '�ނ�'],
            summary: '�����H��k�J�̑厩�R�̒���BBQ�Ɛ�V�т𖞋i�I��Ԃ�v������@�ރ����^�����[�����Ă���A�C�y�ɃA�E�g�h�A���y���߂܂��B',
            details: {
                description: `�����H��k�J�Ɉʒu���A�厩�R�̒���BBQ���V�сA�ނ�Ȃǂ��y���߂�X�|�b�g�ł��B�����t����BBQ�������A�V����C�ɂ������p�ł��܂��B`,
                plan: `�H�ރZ�b�g�̗p�ӂ���BBQ�ɕK�v�ȗp��̃����^���܂őΉ����Ă���A��Ԃ��BBQ���y���߂܂��B7�l�܂ł̉����t������7,000�~�ŗ��p�\�ł��B`,
                activities: `�����ł̐�V�т͂������A�ނ�x�ł̒ނ���y���߂܂��B�厩�R�̒��Ń��t���b�V���������O���[�v�ɍœK�ł��B`,
                access: `�����V��w����ԂŖ�60��?90���B���ʎ�1��1,200�~�̒��ԏꂪ����܂��B`,
                advice: `���R�𖞋i�������w���O���[�v�ɍœK�B��Ԃ�v���������p���A��V�т�ނ�ň�����A�N�e�B�u�ɉ߂����܂��B�l�C�̏ꏊ�Ȃ̂ŁA���ɃV�[�Y�����͑��߂̗\�񂪂������߂ł��B`
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
        return `${value}���ȓ�`;
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
                        <div class="text-3xl">${spot.waterType === '�C' ? '?' : spot.waterType === '��' ? '??' : '?'}</div>
                    </div>
                    <p class="text-sm text-gray-500 mb-4">${spot.location}</p>
                    <p class="text-gray-600 mb-4 text-sm flex-grow">${spot.summary}</p>
                    <div class="flex items-center justify-between text-sm mt-4">
                       <div class="font-bold text-lg text-teal-600">${formatPrice(spot.price)}<span class="text-xs font-normal text-gray-500">/�l~</span></div>
                        <div class="text-gray-600 font-medium">? ${spot.time}��</div>
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
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? �ǂ�ȏꏊ�H</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.description}</p>
                </div>
                 <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? ��Ԃ�v�����ڍ�</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.plan}</p>
                </div>
                <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? �A�N�e�B�r�e�B</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.activities}</p>
                </div>
                 <div>
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? �A�N�Z�X�����ԏ�</h4>
                    <p class="text-gray-700 leading-relaxed">${spot.details.access}</p>
                </div>
                 <div class="lg:col-span-2">
                    <h4 class="text-lg font-bold text-gray-800 mb-3 border-b-2 border-teal-500 pb-1">? ��w�������A�h�o�C�X</h4>
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
