def designerPdfViewer(h, word):
    mx = 0
    for char in word:
        i = ord(char)-97
        if h[i] > mx:
            mx = h[i]
    return len(word)*mx